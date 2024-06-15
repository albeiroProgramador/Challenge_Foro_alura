package com.ChallengeAlura.demo.domain.topic;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DatosCrearTopico(
        @NotNull(message = "User es obligatorio")
        Long idUsuario,
        @NotNull(message = "Título es obligatorio")
        String titulo,
        @NotNull(message = "Mensaje es obligatorio")
        String mensaje,
        @NotNull(message = "Nombre de curso es obligatorio")
        String nombreCurso,
        @NotNull(message = "Estado de tópico es obligatorio")
        @Valid
        Estado status
) {
}
