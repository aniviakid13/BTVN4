package com.example.btvn4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FlAdapter extends RecyclerView.Adapter<FlAdapter.ViewHolder> {
    private Context context;
    private ArrayList<ListFolder> fOlderApdapter;

    public FlAdapter(Context context, ArrayList<ListFolder> fOlderApdapter) {
        this.context = context;
        this.fOlderApdapter = fOlderApdapter;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout3,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtName.setText(fOlderApdapter.get(position).getNameFolder());
    }

    @Override
    public int getItemCount() {
        return fOlderApdapter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.tv_name_floder);
        }
    }
}
