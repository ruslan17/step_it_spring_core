package core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * {host}/swagger-ui.html
 * {host}/v2/api-docs
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger.enabled}")
    private boolean flag;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .enable(flag)
                .select()
                .apis(RequestHandlerSelectors.any())
//                .apis(RequestHandlerSelectors
//                        .basePackage("core.controller"))
                .paths(PathSelectors.any())
//                .paths(regex("/persons.*"))
                .build()
                .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        return new ApiInfoBuilder()
                .title("Swagger API")
                .description("Step IT desc")
                .version("1.0")
                .contact(new Contact(
                        "John",
                        "https://habr.com/",
                        "example@gmail.com"))
                .build();
    }

}