package com.example.btvn4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ListPost> post;
    private PostAdapter p_adapter;
    ImageView imgBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list1);

        post = new ArrayList<>();
        post.add(new ListPost(R.drawable.pos1, "Mua bán có tâm", "8k Fan", "+10 bài viết mới nhất", "NHÓM ĐÓNG"));
        post.add(new ListPost(R.drawable.pos1, "Ăn để lăn", "8k Fan", "+10 bài viết mới nhất", "NHÓM KÍN"));
        post.add(new ListPost(R.drawable.montes, "Chia sẻ kiến thức tài liệu Montessori", "8k Fan", "+10 bài viết mới nhất", "NHÓM MỞ"));
        post.add(new ListPost(R.drawable.pos1, "Mua bán có tâm", "8k Fan", "+10 bài viết mới nhất", "Nhóm Đóng"));
        post.add(new ListPost(R.drawable.pos1, "Mua bán có tâm", "8k Fan", "+10 bài viết mới nhất", "Nhóm Đóng"));
        post.add(new ListPost(R.drawable.pos1, "Mua bán có tâm", "8k Fan", "+10 bài viết mới nhất", "NHÓM ĐÓNG"));
        post.add(new ListPost(R.drawable.pos1, "Ăn để lăn", "8k Fan", "+10 bài viết mới nhất", "NHÓM KÍN"));
        post.add(new ListPost(R.drawable.montes, "Chia sẻ kiến thức tài liệu Montessori", "8k Fan", "+10 bài viết mới nhất", "NHÓM MỞ"));
        post.add(new ListPost(R.drawable.pos1, "Mua bán có tâm", "8k Fan", "+10 bài viết mới nhất", "Nhóm Đóng"));
        post.add(new ListPost(R.drawable.pos1, "Mua bán có tâm", "8k Fan", "+10 bài viết mới nhất", "Nhóm Đóng"));
        p_adapter = new PostAdapter(this, post);

        RecyclerView recyclerView = findViewById(R.id.rcl_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(p_adapter);


        imgBackButton = findViewById(R.id.img_back_button);
        imgBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intentBack);
            }
        });


    }
}