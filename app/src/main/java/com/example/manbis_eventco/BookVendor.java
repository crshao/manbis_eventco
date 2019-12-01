package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.widget.Toast;

import com.example.manbis_eventco.Data.Venue;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class BookVendor extends AppCompatActivity {

    @BindView(R.id.nama_vendor)
    MaterialTextView nama_vendor;

    @BindView(R.id.view_pager)
    ViewPager view_pager;

    @BindView(R.id.vendorDetails)
    MaterialTextView vendorDetails;

    @BindView(R.id.book_button)
    MaterialButton book_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_vendor);
        ButterKnife.bind(this);

        Bundle bundle = getIntent().getExtras();
        int data = bundle.getInt("data");
        String occasion = bundle.getString("occasion");
        Toast.makeText(this, occasion, Toast.LENGTH_LONG).show();

        switch(occasion)
        {
            case "Venue":
                ArrayList<Venue> list = 
                Venue venue =
                break;
        }

    }
}
