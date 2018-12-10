package br.uema.pecs.veterinaria.model;

import sun.util.calendar.Gregorian;

public class Triagem {
    private double peso;
    private double temperatura;
    private String queixa;
    private Gregorian dataTriagem;
    private Animal animal;

    public Triagem(double peso, double temperatura, String queixa, Gregorian dataTriagem, Animal animal) {
        this.peso = peso;
        this.temperatura = temperatura;
        this.queixa = queixa;
        this.dataTriagem = dataTriagem;
        this.animal = animal;
    }

    public Triagem() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getQueixa() {
        return queixa;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    public Gregorian getDataTriagem() {
        return dataTriagem;
    }

    public void setDataTriagem(Gregorian dataTriagem) {
        this.dataTriagem = dataTriagem;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
