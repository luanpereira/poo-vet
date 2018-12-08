package br.uema.pecs.veterinaria;

import sun.util.calendar.Gregorian;

import java.util.Date;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected Gregorian dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Gregorian getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Gregorian dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
