package model.exception;


// classe serializible
public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    // constructor criado para que quando instanciar a classe passando uma mensagem para ela.
    public DomainException(String msg){
        super(msg);
    }
}
