package com.ChallengeAlura.demo.domain.topic.validatesv1;

import com.ChallengeAlura.demo.domain.topic.DatosCrearTopico;
import com.ChallengeAlura.demo.domain.topic.TopicRepv1;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrosDuplicados implements ValidadorDeTopicos{
    @Autowired
    private TopicRepv1 topicRepv1;

// Method definition
    public void validar(DatosCrearTopico datos){
        var titulo = datos.titulo();
        var mensaje = datos.mensaje();

        var registroDuplicado = topicRepv1.existsByTituloAndMensaje(titulo, mensaje);

        if(registroDuplicado){
            throw new ValidationException("Mensaje duplicado en este título");
        }
    }

}
