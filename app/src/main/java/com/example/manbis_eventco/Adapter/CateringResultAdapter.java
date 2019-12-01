package com.example.manbis_eventco.Adapter;

import android.content.Context;
import android.database.MergeCursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.manbis_eventco.Data.Catering;
import com.example.manbis_eventco.R;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class CateringResultAdapter extends RecyclerView.Adapter<CateringResultAdapter.ViewHolder> {

    private ArrayList<Catering> list;
    private Context context;

    public CateringResultAdapter(ArrayList<Catering> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_result,parent,false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Catering catering  = list.get(position);
        holder.judul.setText(catering.getName());
        holder.harga.setText(catering.getPrice());
        holder.gbr.setImageResource(catering.getImage());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        MaterialTextView judul;
        MaterialTextView harga;
        ImageView gbr;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.tv1);
            harga = itemView.findViewById(R.id.tv2);
            gbr = itemView.findViewById(R.id.img_view);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    Catering catering = list.get(position);
                    Toast.makeText(context, catering.getName(), Toast.LENGTH_SHORT).show();
                }
            });


        }
    }
}
