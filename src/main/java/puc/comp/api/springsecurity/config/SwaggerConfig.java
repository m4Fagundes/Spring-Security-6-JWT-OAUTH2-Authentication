package puc.comp.api.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("PUC COMP - OAUTH 2 JWT Spring security")
                        .version("1.0.0")
                        .license(new License()
                                .name("Licenca do Sistema - PUC Comp")
                                .url("http://www.puccomp.com.br")
                        )
                );
    }

}
