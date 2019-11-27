package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;

import com.example.manbis_eventco.Adapter.WeddingOccasionAdapter;
import com.example.manbis_eventco.Data.WeddingOccasion;
import com.example.manbis_eventco.Data.WeddingOccasionData;

import java.util.ArrayList;

public class Filter_Vendor extends AppCompatActivity {

    private RecyclerView rvJenisLayanan;
    private ArrayList<WeddingOccasion> list = new ArrayList<>();

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_vendor);
        ButterKnife.bind(this);

//        recyclerView.setHasFixedSize(true);

        list.addAll(WeddingOccasionData.getWeddingOccasionData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvJenisLayanan.setLayoutManager(new LinearLayoutManager(this));
        WeddingOccasionAdapter weddingOccasionAdapter = new WeddingOccasionAdapter(list);
        rvJenisLayanan.setAdapter(weddingOccasionAdapter);
    }


}
