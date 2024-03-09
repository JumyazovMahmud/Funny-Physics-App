package com.example.funnyphysicsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.funnyphysicsapp.adapter.PlanetAdapter;
import com.example.funnyphysicsapp.adapter.ScientistAdapter;
import com.example.funnyphysicsapp.module.Planet;

import java.util.ArrayList;
import java.util.List;

public class PlanetActivity extends AppCompatActivity {
    private List<Planet> planetList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet);



        Button back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , MainActivity.class);
                startActivity(intent);
                setContentView(R.layout.activity_main);
            }
        });


        RecyclerView recyclerView = findViewById(R.id.planet_rv);

        addData();

        PlanetAdapter planetAdapter = new PlanetAdapter(planetList);

        RecyclerView.LayoutManager a =new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        );

        recyclerView.setLayoutManager(a);

        recyclerView.setAdapter(planetAdapter);

    }

    private void addData() {
        planetList.add(new Planet( "Saturn" , "It is a beautiful planet" , "blue"));
        planetList.add(new Planet( "Mercury" , "It is a small planet" , "red"));
        planetList.add(new Planet( "Earth" , "It is a beautiful planet" , "blue"));
        planetList.add(new Planet( "Venus" , "It is a beautiful planet" , "blue"));
        planetList.add(new Planet( "Jupiter" , "It is a huge planet" , "red and white"));
        planetList.add(new Planet( "Uranus" , "It is a beautiful planet" , "blue"));
        planetList.add(new Planet( "Neptune" , "It is a beautiful planet" , "green"));
        planetList.add(new Planet( "Mars" , "It is a beautiful planet" , "red"));

    }

}
