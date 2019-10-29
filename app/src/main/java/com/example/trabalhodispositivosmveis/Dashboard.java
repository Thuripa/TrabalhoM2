package com.example.trabalhodispositivosmveis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    Button btnVoltar;
    TextView tvResultado;
    TextView tvKM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        btnVoltar = findViewById(R.id.btnVOLTAR);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltar();
            }
        });



    }

    public void voltar() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
