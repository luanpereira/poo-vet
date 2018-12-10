package br.uema.pecs.veterinaria.model;

import java.sql.Date;

public class Consulta {
    private String anamnese;
    private String diagnostico;
    private Date dataConsulta;
    private Triagem triagem;
    private Profissional profissional;

    public Consulta(String anamnese, String diagnostico, Date dataConsulta, Triagem triagem, Profissional profissional) {
        this.anamnese = anamnese;
        this.diagnostico = diagnostico;
        this.dataConsulta = dataConsulta;
        this.triagem = triagem;
        this.profissional = profissional;
    }

    public String getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Triagem getTriagem() {
        return triagem;
    }

    public void setTriagem(Triagem triagem) {
        this.triagem = triagem;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }
}
