package com.example.servicemusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Music> listMusic;
    private MusicAdapter musicAdapter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMusic = new ArrayList<>();
        listMusic.add(new Music("Anh không đòi quà", R.raw.anhkhongdoiqua, R.drawable.anhkhongdoiqua));
        listMusic.add(new Music("Em là châu báu", R.raw.emlachaubau, R.drawable.emlachaubau));
        listMusic.add(new Music("Big city boy", R.raw.bigcityboi, R.drawable.bicityboi));
        listMusic.add(new Music("They said", R.raw.theysaid, R.drawable.theysaid));


        recyclerView = findViewById(R.id.rcv);

        musicAdapter = new MusicAdapter(this, listMusic);

        recyclerView.setAdapter(musicAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        getSupportActionBar().hide();
    }
}