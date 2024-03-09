package com.example.funnyphysicsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.funnyphysicsapp.adapter.ScientistAdapter;
import com.example.funnyphysicsapp.module.Scientist;

import java.util.ArrayList;
import java.util.List;

public class ScientistActivity extends AppCompatActivity {

    private List<Scientist> scientistList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientist);


        Button back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , MainActivity.class);
                startActivity(intent);
                setContentView(R.layout.activity_main);
            }
        });


        RecyclerView recyclerView = findViewById(R.id.scientist_rv);

        addData();

        ScientistAdapter scientistAdapter = new ScientistAdapter(scientistList);

        RecyclerView.LayoutManager a =new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        );

        recyclerView.setLayoutManager(a);

        recyclerView.setAdapter(scientistAdapter);

    }

    private void addData() {
        scientistList.add(new Scientist(R.drawable.albert , "Albert Einstein" , "He was born in Germany"));
        scientistList.add(new Scientist(R.drawable.edison , "Thomas Edison" , "He was born in USA"));
        scientistList.add(new Scientist(R.drawable.tesla , "Nikolay Tesla" , "He was born in USA"));
        scientistList.add(new Scientist(R.drawable.maria , "Maria Skłodowska-Curie" , "He was born in France"));
        scientistList.add(new Scientist(R.drawable.hawking , "Hawking" , "He was born in England"));
    }
}
