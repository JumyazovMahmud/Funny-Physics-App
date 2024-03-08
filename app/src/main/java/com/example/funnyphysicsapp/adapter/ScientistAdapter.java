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
import com.example.funnyphysicsapp.module.Scientist;

import java.util.List;

public class ScientistAdapter extends RecyclerView.Adapter<ScientistAdapter.ViewHolder> {
    private List<Scientist> scientists;

    @NonNull
    @Override
    public ScientistAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myHolder = LayoutInflater.from(parent.getContext()).inflate(R.layout.scientist_item, parent, false);
        return new ScientistAdapter.ViewHolder(myHolder);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ScientistAdapter.ViewHolder holder, int position) {
        Scientist scientist = scientists.get(position);
        holder.vh_photo.setImageResource(scientist.getImageId());
        holder.vh_name.setText(scientist.getName());
        holder.vh_bio.setText(scientist.getBio());
    }

    @Override
    public int getItemCount() {
        return scientists.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView vh_photo;
        TextView vh_name, vh_bio;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            vh_photo = itemView.findViewById(R.id.scientist_photo);
            vh_name = itemView.findViewById(R.id.scientist_name);
            vh_bio = itemView.findViewById(R.id.scientist_bio);
        }
    }
}
