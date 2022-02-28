package com.example.btvn4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    private Context context;
    private ArrayList<ListPost> post;

    public PostAdapter(Context context, ArrayList<ListPost> post) {
        this.context = context;
        this.post = post;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.thumbnail.setImageResource(post.get(position).getThumbnail());
        holder.title1.setText(post.get(position).getTitlepost());
        holder.title2.setText(post.get(position).getFan());
        holder.title3.setText(post.get(position).getAmount());
        holder.title4.setText(post.get(position).getStatus());

    }

    @Override
    public int getItemCount() {
        return post.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView thumbnail;
        TextView title1, title2, title3, title4;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.img_thumbnail);
            title1 = itemView.findViewById(R.id.title1);
            title2 = itemView.findViewById(R.id.title2);
            title3 = itemView.findViewById(R.id.title3);
            title4 = itemView.findViewById(R.id.title4);
        }
    }
}
