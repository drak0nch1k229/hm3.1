package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> movieNameList = new ArrayList<>();
    private RecyclerView rvMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
    }

    private void loadData(){
        movieNameList.add("Rush Hour");
        movieNameList.add("Rush Hour 2");
        movieNameList.add("Rush Hour 3");
        movieNameList.add("Fairy tail");
        movieNameList.add("Supernatural");
        movieNameList.add("Pacific Rim");
        movieNameList.add("Real Steel");
        movieNameList.add("7 Deadly sins");
        movieNameList.add("Karate Kid");
        movieNameList.add("Vanguard");
        movieNameList.add("Sword Art Online");
        movieNameList.add("Black Adam");
        movieNameList.add("Avengers");
        movieNameList.add("Sherlock Holmes");
        movieNameList.add("Doctor Strange");
        initAdapter();
    }

    private void initAdapter(){
        MovieAdapter adapter = new MovieAdapter(movieNameList);
        rvMovie.setAdapter(adapter);
    }

    private void initView(){
        rvMovie = findViewById(R.id.rw_movie);
    }
}