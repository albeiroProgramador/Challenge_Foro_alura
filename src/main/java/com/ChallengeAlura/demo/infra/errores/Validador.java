package com.ChallengeAlura.demo.infra.errores;

public class Validador extends RuntimeException {
    public Validador(String s) {
        super(s);
    }
}
