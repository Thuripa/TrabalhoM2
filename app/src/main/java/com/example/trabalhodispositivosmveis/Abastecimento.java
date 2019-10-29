package com.example.trabalhodispositivosmveis;

public class Abastecimento {

    private String posto;
    private float valor;

    public Abastecimento(String posto, float valor) {
        this.setPosto(posto);
        this.setValor(valor);
    }


    public String getPosto() {
        return posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
