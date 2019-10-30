package com.example.trabalhodispositivosmveis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class EditorAbastecimento extends AppCompatActivity {

    private EditText etPosto;
    private EditText etValor;
    private Button btnAdicionar;
    private ArrayList<Abastecimento> dados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor_abastecimento);

        dados = new ArrayList();
        Bundle b = this.getIntent().getExtras();

        //dados = b.getParcelable("key");

        if(dados!= null) {
            Toast.makeText(this, "DB ZERADO", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "DB COM ITENS", Toast.LENGTH_LONG).show();
        }

        etPosto = findViewById(R.id.etPosto);
        etValor = findViewById(R.id.etValor);

        btnAdicionar = findViewById(R.id.button);
        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adicionar();
            }
        });
    }

    public void adicionar(){

        Abastecimento abastecimento;

        String posto = etPosto.getText().toString();
        float valor = Float.valueOf(etValor.getText().toString());

        Log.d("ALCM", "Posto Setado: "+posto);
        Log.d("ALCM", "Valor Setado: "+valor);

        abastecimento = new Abastecimento(posto, valor);

        Toast.makeText(this, "Abastecimento Criado"+abastecimento.getPosto(), Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MainActivity.class);
        /*Bundle b = new Bundle();
        b.putParcelableArrayList("key1",  dados);
        intent.putExtras(b);*/

        startActivity(intent);

    }
}
