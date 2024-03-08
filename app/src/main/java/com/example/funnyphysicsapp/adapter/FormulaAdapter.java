package com.example.funnyphysicsapp.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.funnyphysicsapp.R;
import com.example.funnyphysicsapp.module.Formula;
import com.example.funnyphysicsapp.module.Scientist;

import java.util.List;

public class FormulaAdapter extends RecyclerView.Adapter<FormulaAdapter.ViewHolder> {

    private List<Formula> formulas;

    @NonNull
    @Override
    public FormulaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myHolder = LayoutInflater.from(parent.getContext()).inflate(R.layout.formula_item, parent, false);
        return new FormulaAdapter.ViewHolder(myHolder);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull FormulaAdapter.ViewHolder holder, int position) {
        Formula formula = formulas.get(position);
        holder.vh_formula.setText(formula.getFormula());
        holder.vh_info.setText(formula.getInfo());
    }

    @Override
    public int getItemCount() {
        return formulas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView vh_formula, vh_info;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            vh_formula = itemView.findViewById(R.id.formula);
            vh_info = itemView.findViewById(R.id.info);
        }
    }
}
