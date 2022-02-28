package com.example.btvn4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    private ArrayList<ListFolder> listFolders;
    private FlAdapter folderAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list3);

        listFolders = new ArrayList<>();
        listFolders.add(new ListFolder("Android"));
        listFolders.add(new ListFolder("Applock"));
        listFolders.add(new ListFolder("Books"));
        listFolders.add(new ListFolder("Map"));
        listFolders.add(new ListFolder("Authenticate Using Google"));
        listFolders.add(new ListFolder("New Floder"));
        listFolders.add(new ListFolder("New Floder 1"));


        folderAdapter = new FlAdapter(this, listFolders);

        RecyclerView recyclerView = findViewById(R.id.rcl_floder);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(folderAdapter);
    }
}