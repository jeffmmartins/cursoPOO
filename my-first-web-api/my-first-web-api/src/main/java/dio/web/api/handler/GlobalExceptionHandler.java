package dio.web.api.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    // Tratamento para a BusinessException personalizada
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ResponseError> handleBusinessException(BusinessException ex, WebRequest request) {
        ResponseError errorResponse = new ResponseError();
        errorResponse.setTimeStamp(new Date());
        errorResponse.setStatus("business error"); // Ou "validation error"
        errorResponse.setStatusCode(HttpStatus.BAD_REQUEST.value()); // Pode ser 400 (Bad Request)
        // Ou HttpStatus.UNPROCESSABLE_ENTITY.value() (422)
        errorResponse.setError(ex.getMessage()); // Usa a mensagem da sua BusinessException

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>(errorResponse, headers, HttpStatus.BAD_REQUEST);
        // Ou HttpStatus.UNPROCESSABLE_ENTITY, dependendo da semântica que você quer dar
    }

    // Tratamento para exceções de argumentos inválidos (ex: validação de parâmetros)
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ResponseError> handleIllegalArgumentException(IllegalArgumentException ex, WebRequest request) {
        ResponseError errorResponse = new ResponseError();
        errorResponse.setTimeStamp(new Date());
        errorResponse.setStatus("error");
        errorResponse.setStatusCode(HttpStatus.BAD_REQUEST.value()); // Define 400
        errorResponse.setError("Argumento inválido: " + ex.getMessage());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>(errorResponse, headers, HttpStatus.BAD_REQUEST);
    }

    // Tratamento para exceções genéricas (qualquer RuntimeException não tratada especificamente)
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ResponseError> handleRuntimeException(RuntimeException ex, WebRequest request) {
        ResponseError errorResponse = new ResponseError();
        errorResponse.setTimeStamp(new Date());
        errorResponse.setStatus("error");
        errorResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value()); // Define 500
        errorResponse.setError("Erro interno no servidor: " + ex.getMessage());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>(errorResponse, headers, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}