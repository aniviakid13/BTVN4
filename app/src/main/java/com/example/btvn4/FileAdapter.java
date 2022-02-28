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

public class FileAdapter extends RecyclerView.Adapter<FileAdapter.Viewholder> {
    private Context context;
    private ArrayList<ListFile> listFile;

    public FileAdapter(Context context, ArrayList<ListFile> listFile) {
        this.context = context;
        this.listFile = listFile;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout2, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.imagefile.setImageResource(listFile.get(position).getFile());
        holder.file_name.setText(listFile.get(position).getFilename());

    }

    @Override
    public int getItemCount() {
        return listFile.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ImageView imagefile;
        TextView file_name;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imagefile = itemView.findViewById(R.id.img_file);
            file_name = itemView.findViewById(R.id.tv_filename);
        }
    }
}
