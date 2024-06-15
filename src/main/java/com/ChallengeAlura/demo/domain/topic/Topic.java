package com.ChallengeAlura.demo.domain.topic;
import com.ChallengeAlura.demo.domain.usuarios.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topic")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
// Class definition
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fecha;
    @Enumerated(EnumType.STRING)
    private Estado status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="autorx_id")
    private User autorx;

    private String nombreCurso;

    public Topic(
            String titulo,
            String mensaje,
            Estado status,
            User autorx,
            String nombreCurso
    ){
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.status = status;
        this.autorx = autorx;
        this.nombreCurso = nombreCurso;
        this.fecha=LocalDateTime.now();

    }

// Method definition
    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if(datosActualizarTopico.titulo()!=null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if(datosActualizarTopico.mensaje()!=null){
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if(datosActualizarTopico.nombreCurso()!=null){
            this.nombreCurso = datosActualizarTopico.nombreCurso();
        }
    }
}
