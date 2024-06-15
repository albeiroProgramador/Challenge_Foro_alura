package com.ChallengeAlura.demo.controller;
import com.ChallengeAlura.demo.domain.usuarios.User;
import jakarta.validation.Valid;
import com.example.demo.domain.usuarios.DatosAutenticacionUsuario;
import com.ChallengeAlura.demo.infra.security.DataToken;
import com.ChallengeAlura.demo.infra.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
// Class definition
public class autController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;
    @PostMapping
// Method definition
    public ResponseEntity autenticarUsuario(@RequestBody @Valid autController datosAutenticacionUsuario){
        Authentication authToken = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.login(), datosAutenticacionUsuario.clave());
        var usuarioAutenticado = authenticationManager.authenticate(authToken);
        var JWTtoken = tokenService.generarToken((User) usuarioAutenticado.getPrincipal());
        return ResponseEntity.ok(new DataToken(JWTtoken));
    }

    private Object clave() {
    }

    private Object login() {
    }
}
