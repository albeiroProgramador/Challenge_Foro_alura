package com.ChallengeAlura.demo.domain.topic;

import java.time.LocalDateTime;

record DatosResponseTopic(
        Long id,
        String titulo,
        String mensaje,
        Estado status,
        String autorx,
        String nombreCurso,
        LocalDateTime fecha
) {
}
