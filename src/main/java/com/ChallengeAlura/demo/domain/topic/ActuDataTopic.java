package com.ChallengeAlura.demo.domain.topic;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        Long id,
        String titulo,
        String mensaje,
        String nombreCurso
) {
}
