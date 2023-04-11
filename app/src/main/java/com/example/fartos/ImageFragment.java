package com.example.fartos;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ImageFragment#} factory method to
 * create an instance of this fragment.
 */
public class ImageFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_image, container, false);

        recyclerView = view.findViewById(R.id.CartasRecycler);

        ArrayList<Integer> data = new ArrayList<>();
        data.add(R.drawable.pj1);
        data.add(R.drawable.pj1);
        data.add(R.drawable.pj1);
        data.add(R.drawable.pj1);
        data.add(R.drawable.pj1);
        data.add(R.drawable.pj1);

        // Añade tantas imágenes como quieras mostrar

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new ImageAdapter(data));

        return view;
    }

    public void isVisible(int invisible) {
    }

    public static class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {

        private final List<Integer> data;

        public ImageAdapter(List<Integer> data) {
            this.data = data;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cartas, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        }

        @Override
        public int getItemCount() {
            return data.size();
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {

            private final ImageView imageView;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.image_view);

            }
        }
    }
}
