package com.example.manbis_eventco.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.manbis_eventco.Data.Venue;
import com.example.manbis_eventco.R;
import com.google.android.material.textview.MaterialTextView;

import java.lang.reflect.Type;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VenueResultAdapter extends RecyclerView.Adapter<VenueResultAdapter.ViewHolder> {

    private ArrayList<Venue> list;
    private Context context;

    public VenueResultAdapter(ArrayList<Venue> list,Context context) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_result, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Venue venue = list.get(position);
        holder.judul.setText(venue.getName());
        holder.price.setText(venue.getPrice());
        holder.gbr.setImageResource(venue.getImage());
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

            itemView.setOnClickListener(v -> {
                int position = getAdapterPosition();
                Venue venue = list.get(position);
                Toast.makeText(context, venue.getName(), Toast.LENGTH_SHORT).show();
            });
        }
    }
}
