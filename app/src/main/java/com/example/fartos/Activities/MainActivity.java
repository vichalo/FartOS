package com.example.fartos.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fartos.Adapters.PlayerAdapter;
import com.example.fartos.ImageFragment;
import com.example.fartos.LayoutManager.ScaleCenterItemLayoutManager;
import com.example.fartos.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button showCards;
    RecyclerView recyclerView;
    ScaleCenterItemLayoutManager linearLayoutManager;
    ImageFragment imageFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCards =(Button) findViewById(R.id.showCartas1);
        List<Integer> data = new ArrayList<>();
        data.add(R.drawable.pj1);
        data.add(R.drawable.pj2);
        data.add(R.drawable.pj3);
// Añade tantas imágenes como quieras mostrar

        imageFragment = new ImageFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, imageFragment).commit();
        recyclerView = findViewById(R.id.casilla0);
        linearLayoutManager = new ScaleCenterItemLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        PlayerAdapter adapter = new PlayerAdapter(data);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
        showCards.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.showCartas1:
                if(showCards.getText().equals("Show cards")){
                    showCards.setText("Hide cards");
                    imageFragment.isVisible(View.VISIBLE);
                }else {
                    showCards.setText("Show cards");
                    imageFragment.isVisible(View.INVISIBLE);

                }
        }
    }
}