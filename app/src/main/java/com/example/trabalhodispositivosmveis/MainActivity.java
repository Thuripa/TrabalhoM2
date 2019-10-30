package com.example.trabalhodispositivosmveis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemClickListener {

    RecyclerViewAdapter adapter;
    Button btnDashboard;
    FloatingActionButton fabBtnNovo;
    ArrayList<Abastecimento> dados = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Popula Dados

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
        dados.add(new Abastecimento("Shell  ", 63.75f));
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
        dados.add(new Abastecimento("Shell  ", 63.75f));


        // seta RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvAbastecimento);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(this, dados);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        fabBtnNovo = findViewById(R.id.floatingActionButton);
        fabBtnNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                novoAbastecimento();
            }
        });

        btnDashboard = findViewById(R.id.btnDashboard);
        btnDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dashboard();
            }
        });


        /*Log.d("ALCM", "ON CREATE COMPLETO");*/
    }

    /*@Override
    protected void onResume() {
        super.onResume();


        Intent intent = getIntent();
        if (intent != null) {
            Bundle b = this.getIntent().getExtras();
            dados = b.getParcelable("key1");
            adapter.notifyDataSetChanged();
        } else {
            Toast.makeText(this, "INTENT NULL", Toast.LENGTH_LONG).show();
        }

    }*/

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position).getPosto() + " on row number " + position, Toast.LENGTH_SHORT).show();
    }



    public void dashboard(){
        Intent intent = new Intent(this, Dashboard.class);

        /*Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("key0", dados);
        intent.putExtras(bundle);*/
        startActivity(intent);
    }

    public void novoAbastecimento() {
        Intent intent = new Intent(this, EditorAbastecimento.class);
        /*Bundle b = new Bundle();
        b.putParcelableArrayList("key",  dados);
        intent.putExtras(b);*/
        startActivity(intent);
    }

}