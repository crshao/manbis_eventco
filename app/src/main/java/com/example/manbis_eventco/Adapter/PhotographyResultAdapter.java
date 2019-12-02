package com.example.manbis_eventco.Adapter;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.manbis_eventco.BookVendor;
import com.example.manbis_eventco.Data.Photobooth;
import com.example.manbis_eventco.Data.Photography;
import com.example.manbis_eventco.R;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PhotographyResultAdapter extends RecyclerView.Adapter<PhotographyResultAdapter.ViewHolder> {
    private ArrayList<Photography> list;
    private Context context;
    String test;

    public PhotographyResultAdapter(ArrayList<Photography> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        test = "Photography & Videography";
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_result, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Photography photography = list.get(position);
        holder.judul.setText(photography.getName());
        holder.price.setText(photography.getPrice());
        holder.gbr.setImageResource(photography.getImages());
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
                    Photography photography = list.get(position);

                    Intent intent = new Intent(context, BookVendor.class);
                    intent.putExtra("occasion", test);
                    intent.putExtra("data", position);
                    context.startActivity(intent);
                }
            });
        }
    }
}
