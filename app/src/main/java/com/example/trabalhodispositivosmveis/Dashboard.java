package com.example.trabalhodispositivosmveis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {

    Button btnVoltar;
    TextView tvResultado;
    TextView tvKM;
    private ArrayList<Abastecimento> dados;
    private float resultado;
    private float km;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        km = 0f;

        Intent lastIntent = getIntent();
        //dados = lastIntent.getExtras().getParcelableArrayList("key0");

        if(dados == null) {
            Toast.makeText(this, "DADOS = NULL!", Toast.LENGTH_LONG).show();
            Log.d("ALCM", "DADOS NULL");
        } else {

            if(dados.isEmpty()){
                tvResultado.setText(tvResultado.getText()+" 0");
                tvKM.setText(tvKM.getText()+"  0");
            } else  {
                float kms=0;
                for (int i = 0; i <dados.size(); i++) {
                        kms = kms + dados.get(i).getValor();
                }

                resultado(kms);

                tvResultado.setText(tvResultado.getText()+" 0");
                tvKM.setText(tvKM.getText()+String.valueOf(km));

            }


        }



        btnVoltar = findViewById(R.id.btnVOLTAR);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltar();
            }
        });



    }

    public void resultado(float kms) {

        this.km = kms;
    }

    public void voltar() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
