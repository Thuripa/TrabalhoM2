package com.example.trabalhodispositivosmveis;

import android.os.Parcel;
import android.os.Parcelable;

public class Abastecimento implements Parcelable {

    private String posto;
    private float valor;


    public Abastecimento(String posto, float valor) {
        this.setPosto(posto);
        this.setValor(valor);
    }


    protected Abastecimento(Parcel in) {
        posto = in.readString();
        valor = in.readFloat();
    }

    public static final Creator<Abastecimento> CREATOR = new Creator<Abastecimento>() {
        @Override
        public Abastecimento createFromParcel(Parcel in) {
            return new Abastecimento(in);
        }

        @Override
        public Abastecimento[] newArray(int size) {
            return new Abastecimento[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(posto);
        dest.writeFloat(valor);
    }
}
