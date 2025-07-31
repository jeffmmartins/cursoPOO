package dio.web.api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title - Rest API")
                        .description("API de uso de springboot REST API")
                        .version("1.0")
                        .termsOfService("Termo de uso opensouce")
                        .license(new License()
                                .name("Linceça: Soua empresa")
                                .url("http://seusite.com.br"))
                        .contact(new Contact()
                                .name("Seu nome")
                                .url("http://ww.seusite.com.br")
                                .email("vc@seusite.com.br")));
    }
}