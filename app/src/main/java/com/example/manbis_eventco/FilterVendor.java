package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.manbis_eventco.Adapter.WeddingOccasionAdapter;
import com.example.manbis_eventco.Data.WeddingOccasion;
import com.example.manbis_eventco.Data.WeddingOccasionData;

import java.util.ArrayList;

public class FilterVendor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_vendor);
        Bundle bundle = getIntent().getExtras();
        String data = bundle.getString("data");

        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, FilterResult.class);
        intent.putExtra("data", data);
        startActivity(intent);
    }
}
