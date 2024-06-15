package com.ChallengeAlura.demo.domain.topic;

import java.time.LocalDateTime;

public record DatosListadoTopico (
        Long id,
        String titulo,
        String mensaje,
        Estatusv1 status,
        String autorx,
        String nombreCurso,
        LocalDateTime fecha){
    public DatosListadoTopico(Topic topico){
        this(topico.getId(),topico.getTitulo(),topico.getMensaje(),topico.getStatus(),topico.getAutorx().getUsername(),topico.getNombreCurso(),topico.getFecha());
    }
}
