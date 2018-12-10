package br.uema.pecs.veterinaria.model;

import sun.util.calendar.Gregorian;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Profissional implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private long CRMV;
    private String uf;

    public Profissional(String nome, String cpf, long CRMV) {
        this.nome = nome;
        this.cpf = cpf;
        this.CRMV = CRMV;
    }

    public long getCRMV() {
        return CRMV;
    }

    public void setCRMV(long CRMV) {
        this.CRMV = CRMV;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
