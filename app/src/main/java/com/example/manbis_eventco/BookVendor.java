package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.manbis_eventco.Adapter.VenueResultAdapter;
import com.example.manbis_eventco.Adapter.ViewPagerAdapter;
import com.example.manbis_eventco.Data.Venue;
import com.example.manbis_eventco.Data.VenueData;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class BookVendor extends AppCompatActivity {

    @BindView(R.id.nama_vendor)
    MaterialTextView nama_vendor;

    @BindView(R.id.img_view)
    ImageView img_view;

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
//        Toast.makeText(this, occasion, Toast.LENGTH_LONG).show();

//        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
//
//        view_pager.setAdapter(viewPagerAdapter);

        switch(occasion)
        {
            case "Venue":
                ArrayList<Venue> list = new ArrayList<>();
                list.addAll(VenueData.getVenueData());
                Venue venue = list.get(data);
                nama_vendor.setText(venue.getName());
                vendorDetails.setText(venue.getDesc());
                img_view.setImageResource(venue.getImage());
                break;
        }

    }
}
