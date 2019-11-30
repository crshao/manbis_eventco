package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.manbis_eventco.Adapter.WeddingOccasionAdapter;
import com.example.manbis_eventco.Data.WeddingOccasion;
import com.example.manbis_eventco.Data.WeddingOccasionData;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class FilterVendor extends AppCompatActivity {

    @BindView(R.id.button_search)
    MaterialButton button_search;

    Bundle bundle;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_vendor);
        ButterKnife.bind(this);
        bundle = getIntent().getExtras();
        data = bundle.getString("data");

        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button_search)
    public void move()
    {
        Intent intent = new Intent(this, FilterResult.class);
        intent.putExtra("data", data);
        startActivity(intent);
    }
}
