package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.manbis_eventco.Adapter.VenueResultAdapter;
import com.example.manbis_eventco.Adapter.ViewPagerAdapter;
import com.example.manbis_eventco.Data.Catering;
import com.example.manbis_eventco.Data.CateringData;
import com.example.manbis_eventco.Data.Decoration;
import com.example.manbis_eventco.Data.DecorationData;
import com.example.manbis_eventco.Data.Entertainment;
import com.example.manbis_eventco.Data.EntertainmentData;
import com.example.manbis_eventco.Data.Photobooth;
import com.example.manbis_eventco.Data.PhotoboothData;
import com.example.manbis_eventco.Data.Photography;
import com.example.manbis_eventco.Data.PhotographyData;
import com.example.manbis_eventco.Data.Venue;
import com.example.manbis_eventco.Data.VenueData;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class BookVendor extends AppCompatActivity {

    @BindView(R.id.nama_vendor)
    MaterialTextView nama_vendor;

    @BindView(R.id.img_view)
    ImageView img_view;

    @BindView(R.id.vendorDetails)
    MaterialTextView vendorDetails;

    @BindView(R.id.price)
    MaterialTextView vendorPrice;

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


        switch (occasion) {
            case "Venue":
                ArrayList<Venue> listVenue = new ArrayList<>();
                listVenue.addAll(VenueData.getVenueData());
                Venue venue = listVenue.get(data);
                nama_vendor.setText(venue.getName());
                vendorDetails.setText(venue.getDesc());
                vendorPrice.setText(venue.getPrice());
                img_view.setImageResource(venue.getImage());
                break;
            case "Catering":
                ArrayList<Catering> listCatering = new ArrayList<>();
                listCatering.addAll(CateringData.getCateringData());
                Catering catering = listCatering.get(data);
                nama_vendor.setText(catering.getName());
                vendorDetails.setText(catering.getPhonenum() + catering.getAddress());
                img_view.setImageResource(catering.getImage());
                vendorPrice.setText(catering.getPrice());
                break;
            case "Decoration & Lighting":
                ArrayList<Decoration> listDecoration = new ArrayList<>();
                listDecoration.addAll(DecorationData.getDecorationData());
                Decoration decoration = listDecoration.get(data);
                nama_vendor.setText(decoration.getName());
                vendorDetails.setText(decoration.getDesc());
                img_view.setImageResource(decoration.getImage());
                vendorPrice.setText(decoration.getPrice());
                break;
            case "Photobooth":
                ArrayList<Photobooth> listPhotobooth = new ArrayList<>();
                listPhotobooth.addAll(PhotoboothData.getPhotoboothData());
                Photobooth photobooth = listPhotobooth.get(data);
                nama_vendor.setText(photobooth.getName());
                vendorDetails.setText(photobooth.getDesc());
                img_view.setImageResource(photobooth.getImages());
                vendorPrice.setText(photobooth.getPrice());
                break;
            case "Photography & Videography":
                ArrayList<Photography> listPhotography = new ArrayList<>();
                listPhotography.addAll(PhotographyData.getPhotographyData());
                Photography photography = listPhotography.get(data);
                nama_vendor.setText(photography.getName());
                vendorDetails.setText(photography.getDesc() + photography.getPhoneNum() + photography.getAddress());
                img_view.setImageResource(photography.getImages());
                vendorPrice.setText(photography.getPrice());
                break;
            case "Entertainment":
                ArrayList<Entertainment> listEntertainment = new ArrayList<>();
                listEntertainment.addAll(EntertainmentData.getEntertainmentData());
                Entertainment entertainment = listEntertainment.get(data);
                nama_vendor.setText(entertainment.getName());
                vendorDetails.setText(entertainment.getDesc());
                img_view.setImageResource(entertainment.getImage());
                vendorPrice.setText(entertainment.getPrice());
                break;
        }

    }

    @OnClick(R.id.book_button)
    public void move(View view){
        Intent intent = new Intent(this, PaymentMethod.class);
        startActivity(intent);
    }
}
