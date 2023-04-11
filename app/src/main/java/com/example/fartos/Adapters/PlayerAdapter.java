package com.example.fartos.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fartos.Clases.Carta;
import com.example.fartos.ImageFragment;
import com.example.fartos.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
    public class PlayerAdapter extends RecyclerView.Adapter<ImageFragment.ImageAdapter.ViewHolder> {

        private final List<Integer> data;

        public PlayerAdapter(List<Integer> data) {
            this.data = data;
        }

        @NonNull
        @Override
        public ImageFragment.ImageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cartas, parent, false);
            return new ImageFragment.ImageAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ImageFragment.ImageAdapter.ViewHolder holder, int position) {
        }

        @Override
        public int getItemCount() {
            return data.size();
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {

            private final ImageView imageView;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.personaje);

            }
        }
    }

