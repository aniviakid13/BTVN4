package com.example.btvn4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private ArrayList<ListFile> files;
    private FileAdapter FileAdapter;
    ImageButton imgbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list2);

        files = new ArrayList<>();
        files.add(new ListFile(R.drawable.pdf, "To kill a Mockingbird"));
        files.add(new ListFile(R.drawable.pdf, "To kill a Mockingbird"));
        files.add(new ListFile(R.drawable.pdf, "To kill a Mockingbird"));
        files.add(new ListFile(R.drawable.pdf, "To kill a Mockingbird"));
        files.add(new ListFile(R.drawable.pdf, "To kill a Mockingbird"));


        FileAdapter = new FileAdapter(this, files);

        RecyclerView recyclerView = findViewById(R.id.rcl_pdf);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(FileAdapter);

        imgbtn =findViewById(R.id.btn_view);


        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intentBack);
            }
        });
    }
}