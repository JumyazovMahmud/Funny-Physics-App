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
import com.example.funnyphysicsapp.module.Planet;
import com.example.funnyphysicsapp.module.Scientist;

import java.util.List;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.ViewHolder> {

    private List<Planet> planets;

    @NonNull
    @Override
    public PlanetAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myHolder = LayoutInflater.from(parent.getContext()).inflate(R.layout.planet_item, parent, false);
        return new ViewHolder(myHolder);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull PlanetAdapter.ViewHolder holder, int position) {
        Planet planet = planets.get(position);
        holder.vh_planet_color.setText(planet.getColor());
        holder.vh_name.setText(planet.getName());
        holder.vh_info.setText(planet.getInfo());
    }

    @Override
    public int getItemCount() {
        return planets.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView vh_name, vh_info, vh_planet_color;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            vh_planet_color = itemView.findViewById(R.id.color);
            vh_name = itemView.findViewById(R.id.planet_name);
            vh_info = itemView.findViewById(R.id.planet_info);
        }
    }
}
