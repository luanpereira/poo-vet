package br.uema.pecs.veterinaria.model;

import br.uema.pecs.veterinaria.enuns.TipoEspecie;
import br.uema.pecs.veterinaria.enuns.TipoRaca;
import br.uema.pecs.veterinaria.enuns.TipoSexo;

import java.sql.Date;

public class Animal {
    private Proprietario proprietario;
    private String nome;
    private Date dataNascimento;
    private TipoSexo sexo;
    private TipoEspecie especie;
    private TipoRaca tipoRaca;

    public Animal() {
    }

    public Animal(Proprietario proprietario, String nome) {
        this.proprietario = proprietario;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.especie = especie;
        this.tipoRaca = tipoRaca;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public TipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    public TipoEspecie getEspecie() {
        return especie;
    }

    public void setEspecie(TipoEspecie especie) {
        this.especie = especie;
    }

    public TipoRaca getTipoRaca() {
        return tipoRaca;
    }

    public void setTipoRaca(TipoRaca tipoRaca) {
        this.tipoRaca = tipoRaca;
    }
}
