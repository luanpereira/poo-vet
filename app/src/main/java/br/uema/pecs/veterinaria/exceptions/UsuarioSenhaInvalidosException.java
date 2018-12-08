package br.uema.pecs.veterinaria.exceptions;

public class UsuarioSenhaInvalidosException extends Throwable {
    public UsuarioSenhaInvalidosException() {
    }

    public UsuarioSenhaInvalidosException(String message) {
        super(message);
    }
}
