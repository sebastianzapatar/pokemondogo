package com.name.nombre.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 🛑 Esta anotación indica que esta es una clase de configuración
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Documentación con Swagger")
                        .version("1.0")
                        .description("Documentación de la API con OpenAPI 3 y Swagger UI"));
    }
}

