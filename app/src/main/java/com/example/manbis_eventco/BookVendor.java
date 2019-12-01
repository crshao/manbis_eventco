package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

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

        Bundle bundle = getIntent().getExtras();
        String data = bundle.getString("data");
        String occasion = bundle.getString("occasion");
        Toast.makeText(this, occasion, Toast.LENGTH_LONG).show();

    }
}
