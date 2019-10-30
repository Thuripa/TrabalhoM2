package com.example.trabalhodispositivosmveis;

import android.os.Parcel;
import android.os.Parcelable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;


public class Abastecimento extends RealmObject {


    @PrimaryKey
    private long id;

    private String posto;
    private float valor;

    public Abastecimento() {

    }

    public Abastecimento(long id, String posto, float valor) {
        this.setId(id);
        this.setPosto(posto);
        this.setValor(valor);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
