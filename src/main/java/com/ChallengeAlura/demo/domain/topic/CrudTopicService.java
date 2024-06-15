package com.ChallengeAlura.demo.domain.topic;

import com.ChallengeAlura.demo.domain.topic.validatesv1.ValidadorDeTopicos;
import com.ChallengeAlura.demo.domain.usuarios.UsuarioRepository;
import com.ChallengeAlura.demo.infra.errores.Validador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// Class definition
public class CrudTopicService {
    @Autowired
    private TopicRepv1 topicRepv1;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    List<ValidadorDeTopicos> validadores;
    /*
    @Autowired
    List<ValidadorCancelamientoDeConsulta> validadoresCancelamiento;
     */

// Method definition
    public DatosDetalleTopico crear(DatosCrearTopico datos){
        if(datos.idUsuario()!=null&&!usuarioRepository.existsById(datos.idUsuario())){
            throw new Validador("Id de usuario no encontrado");
        }
        validadores.forEach(v->v.validar(datos));
        var usuario = usuarioRepository.findById(datos.idUsuario()).get();
        var topico = new Topic(
                datos.titulo(),
                datos.mensaje(),
                datos.status(),
                usuario,
                datos.nombreCurso()
        );
        topicRepv1.save(topico);
        return new DatosDetalleTopico(topico);
    }


}
