package com.example.trabalhodispositivosmveis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemClickListener {

    RecyclerViewAdapter adapter;
    Button btnDashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList<Abastecimento> dados = new ArrayList<>();
        dados.add(new Abastecimento("Shell  ", 53.60f));
        dados.add(new Abastecimento("Petrobras  ", 70.00f));
        dados.add(new Abastecimento("Ipiranga   ", 54.80f));
        dados.add(new Abastecimento("Shell  ", 63.75f));
        dados.add(new Abastecimento("Shell  ", 53.60f));
        dados.add(new Abastecimento("Petrobras  ", 70.00f));
        dados.add(new Abastecimento("Ipiranga   ", 54.80f));
        dados.add(new Abastecimento("Shell  ", 63.75f));
        dados.add(new Abastecimento("Shell  ", 53.60f));
        dados.add(new Abastecimento("Petrobras  ", 70.00f));
        dados.add(new Abastecimento("Ipiranga   ", 54.80f));
        dados.add(new Abastecimento("Shell  ", 63.75f));dados.add(new Abastecimento("Shell  ", 53.60f));
        dados.add(new Abastecimento("Petrobras  ", 70.00f));
        dados.add(new Abastecimento("Ipiranga   ", 54.80f));
        dados.add(new Abastecimento("Shell  ", 63.75f));
        dados.add(new Abastecimento("Shell  ", 53.60f));
        dados.add(new Abastecimento("Petrobras  ", 70.00f));
        dados.add(new Abastecimento("Ipiranga   ", 54.80f));
        dados.add(new Abastecimento("Shell  ", 63.75f));
        dados.add(new Abastecimento("Shell  ", 53.60f));
        dados.add(new Abastecimento("Petrobras  ", 70.00f));
        dados.add(new Abastecimento("Ipiranga   ", 54.80f));
        dados.add(new Abastecimento("Shell  ", 63.75f));


        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvAbastecimento);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(this, dados);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        btnDashboard = findViewById(R.id.btnDashboard);
        btnDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dashboard();
            }
        });
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position).getPosto() + " on row number " + position, Toast.LENGTH_SHORT).show();
    }

    public void dashboard(){
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }

}