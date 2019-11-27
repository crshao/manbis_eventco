package com.example.manbis_eventco.Adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.manbis_eventco.Data.WeddingOccasion;
import com.example.manbis_eventco.R;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class WeddingOccasionAdapter extends RecyclerView.Adapter<WeddingOccasionAdapter.WeddingOccasionViewHolder> {

    private ArrayList<WeddingOccasion> list;

    public WeddingOccasionAdapter(ArrayList<WeddingOccasion> weddingOccasionList)
    {
        this.list = weddingOccasionList;
    }

    @NonNull
    @Override
    public WeddingOccasionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        MASUKIN layout DetailItemWeddingOccasion pada parameter pertama
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_wedding_occasion, parent, false);
        return new WeddingOccasionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeddingOccasionViewHolder holder, int position) {
        WeddingOccasion weddingOccasion = list.get(position);
        holder.jenisLayanan.setText(weddingOccasion.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class WeddingOccasionViewHolder extends RecyclerView.ViewHolder {

        MaterialTextView jenisLayanan;

        public WeddingOccasionViewHolder(@NonNull View itemView) {
            super(itemView);
            //MENGAPA TIDAK BISA PAKAI BUTTERKNIFE DISINI ?
            jenisLayanan = itemView.findViewById(R.id.jenis_layanan);
        }
    }
}
