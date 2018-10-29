package br.uema.pecs.veterinaria;

import sun.util.calendar.Gregorian;

public class Consulta {
    private String anamnese;
    private String diagnostico;
    private Gregorian dataConsulta;
    private Triagem triagem;
    private Profissional profissional;

    public Consulta(String anamnese, String diagnostico, Gregorian dataConsulta, Triagem triagem, Profissional profissional) {
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

    public Gregorian getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Gregorian dataConsulta) {
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
