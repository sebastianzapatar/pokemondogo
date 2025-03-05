package com.name.nombre.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = "org.springdoc")
public class SwaggerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleSwaggerException(Exception ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Swagger no encontrado.");
    }
}
