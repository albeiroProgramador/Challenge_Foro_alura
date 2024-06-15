package com.ChallengeAlura.demo.infra.errores;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.ValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
// Class definition
public class TratandoErroresv1 {

    @ExceptionHandler(EntityNotFoundException.class)
// Method definition
    public ResponseEntity tratarError404(){
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
// Method definition
    public ResponseEntity tratarError400(MethodArgumentNotValidException e){
        var errores = e.getFieldErrors().stream().
                map(DatosErrorValidacion::new).toList();
        return ResponseEntity.badRequest().body(errores);
    }

    @ExceptionHandler(Validador.class)
// Method definition
    public ResponseEntity errorHandlerValidacionesDelIntegridad(Exception e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }
    @ExceptionHandler(ValidationException.class)
// Method definition
    public ResponseEntity errorHandlerValidacionesDelNegocio(Exception e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    private record DatosErrorValidacion(String campo, String error){
        public DatosErrorValidacion(FieldError error){
            this(error.getField(),error.getDefaultMessage());
        }
    }

}
