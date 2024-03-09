package com.example.funnyphysicsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.funnyphysicsapp.adapter.FormulaAdapter;
import com.example.funnyphysicsapp.adapter.PlanetAdapter;
import com.example.funnyphysicsapp.module.Formula;

import java.util.ArrayList;
import java.util.List;

public class FormulaActivity extends AppCompatActivity {
    private List<Formula> formulaList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula);


        Button back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , MainActivity.class);
                startActivity(intent);
                setContentView(R.layout.activity_main);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.formula_rv);

        addData();

        FormulaAdapter formulaAdapter = new FormulaAdapter(formulaList);

        RecyclerView.LayoutManager a =new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        );

        recyclerView.setLayoutManager(a);

        recyclerView.setAdapter(formulaAdapter);

    }

    private void addData() {

        formulaList.add(new Formula("E=m * c * c" , "Einstein's formula"));
        formulaList.add(new Formula("F = m * g" , "Newton's formula"));
        formulaList.add(new Formula("P = m * g" , "Newton's formula"));
        formulaList.add(new Formula("R = U/I" , "Maria's formula"));
        formulaList.add(new Formula("c * c = E/m" , "Einstein's formula"));
        formulaList.add(new Formula("S = t * v" , "Unknown's formula"));

    }
}
