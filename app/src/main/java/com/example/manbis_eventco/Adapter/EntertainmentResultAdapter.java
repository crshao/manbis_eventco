package com.example.manbis_eventco.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.manbis_eventco.Data.Entertainment;
import com.example.manbis_eventco.R;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EntertainmentResultAdapter extends RecyclerView.Adapter<EntertainmentResultAdapter.ViewHolder> {

    private ArrayList<Entertainment> list;
    private Context context;

    public EntertainmentResultAdapter(ArrayList<Entertainment> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_result, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Entertainment entertainment = list.get(position);
        holder.judul.setText(entertainment.getName());
        holder.price.setText(entertainment.getPrice());
        holder.gbr.setImageResource(entertainment.getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        MaterialTextView judul;
        MaterialTextView price;
        ImageView gbr;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            judul = itemView.findViewById(R.id.tv1);
            price = itemView.findViewById(R.id.tv2);
            gbr = itemView.findViewById(R.id.img_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    Entertainment entertainment = list.get(position);

                }
            });
        }
    }
}
