package br.uema.pecs.veterinaria;

import java.util.Date;

public class Proprietario extends Pessoa{
    private String logradouro;
    private String numero;
    private String bairro;
    private long cidade;
    private long cep;
    private String telefone;
    private String celular;
    private String email;

    public Proprietario() {
    }

    public Proprietario(String nome, String cpf) {
        super.nome = nome;
        super.cpf = cpf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public long getCidade() {
        return cidade;
    }

    public void setCidade(long cidade) {
        this.cidade = cidade;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
