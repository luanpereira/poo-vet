package br.uema.pecs.veterinaria;

public class Profissional extends Pessoa {
    private long CRMV;
    private String uf;

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
}
