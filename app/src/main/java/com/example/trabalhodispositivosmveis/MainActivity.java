package com.example.trabalhodispositivosmveis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemClickListener {

    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");
        animalNames.add("Boar");
        animalNames.add("Lion");
        animalNames.add("Dog");
        animalNames.add("Elephant");
        animalNames.add("Bird");
        animalNames.add("Squirtle");
        animalNames.add("Valesca Popozuda");
        animalNames.add("Felipe Neto");
        animalNames.add("Horse 2");
        animalNames.add("Cow 2");
        animalNames.add("Camel 2");
        animalNames.add("Sheep 2");
        animalNames.add("Goat 2");
        animalNames.add("Boar 2");
        animalNames.add("Lion 2");
        animalNames.add("Dog 2");
        animalNames.add("Elephant 2");
        animalNames.add("Bird 2");
        animalNames.add("Squirtle 2");
        animalNames.add("Valesca Popozuda 2");
        animalNames.add("Felipe Neto 1");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvAbastecimento);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(this, animalNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}