package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.manbis_eventco.Adapter.WeddingOccasionAdapter;
import com.example.manbis_eventco.Data.WeddingOccasion;
import com.example.manbis_eventco.Data.WeddingOccasionData;

import java.util.ArrayList;

public class ListVendor extends AppCompatActivity {

    private ArrayList<WeddingOccasion> list = new ArrayList<>();

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

//    ListView listView;
// /*   ArrayList<String> list_vendor;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_vendor);
        ButterKnife.bind(this);

        recyclerView.setHasFixedSize(true);

        list.addAll(WeddingOccasionData.getWeddingOccasionData());
        showRecyclerList();

       /* for(int i = 0 ; i <  getResources().getStringArray(R.array.vendorList).length;i++){
            list_vendor.add(getResources().getStringArray(R.array.vendorList[i]))
        }*/

//    listView = findViewById(R.id.list_view);
//
//    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(ListVendor.this,android.R.layout.simple_list_item_1
//        ,getResources().getStringArray(R.array.vendorList));
//
//    listView.setAdapter(arrayAdapter);
    }

    private void showRecyclerList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        WeddingOccasionAdapter weddingOccasionAdapter = new WeddingOccasionAdapter(list);
        recyclerView.setAdapter(weddingOccasionAdapter);
    }
}
