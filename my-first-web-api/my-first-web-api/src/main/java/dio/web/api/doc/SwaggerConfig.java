package dio.web.api.doc;

import org.mapstruct.Mapping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    // Define os tipos de mídia comuns para JSON
    private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES =
            new HashSet<String>(Arrays.asList("application/json"));

    //Metodos para retornar dados de um contato
    private springfox.documentation.service.Contact contact(){
        return new Contact(
                "Seu nome",
                "http://ww.seusite.com.br",
                "email: vc@seusite.com.br"
        );
    }

    //Metodo para retornar informações da API
    private ApiInfoBuilder informacoesApi(){
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("Title - Rest API");
        apiInfoBuilder.description("API de uso de springboot REST API");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Termo de uso opensouce");
        apiInfoBuilder.license("Linceça: Soua empresa");
        apiInfoBuilder.licenseUrl("http://seusite.com.br");
        apiInfoBuilder.contact(this.contact());

        return apiInfoBuilder;
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                // Define o pacote base onde os controllers estão
                .apis(RequestHandlerSelectors.basePackage("dio.web.api.controller")) // <<-- MUDAR ESTE PACOTE
                .paths(PathSelectors.any()) // Inclui todos os caminhos (endpoints)
                .build()
                .apiInfo(this.informacoesApi().build())
                .consumes(DEFAULT_PRODUCES_AND_CONSUMES) // Adicionado aqui
                .produces(DEFAULT_PRODUCES_AND_CONSUMES); // Adicionado aqui
    }

}
