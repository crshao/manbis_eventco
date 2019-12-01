package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.renderscript.Type;

import com.example.manbis_eventco.Adapter.VenueResultAdapter;
import com.example.manbis_eventco.Data.Venue;
import com.example.manbis_eventco.Data.VenueData;

import java.util.ArrayList;

public class FilterResult extends AppCompatActivity {

    //SEMENTARA ARRAYLIST VENUE, KARENA BELUM BELAJAR GENERIC DATA TYPE
    /*private ArrayList<Venue> list = new ArrayList<>();*/
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_result);
        ButterKnife.bind(this);

        Bundle bundle = getIntent().getExtras();
        String data = bundle.getString("data");

        //MASIH BELUM TAU UNTUK APA
        recyclerView.setHasFixedSize(true);

        switch(data)
        {
            case "Venue":
                ArrayList<Venue> listVenue = new ArrayList<>();
                listVenue.addAll(VenueData.getVenueData());
                showVenue();
                break;
            case "Catering":

                break;
            default:
                System.out.println("MASUK KE DEFAULT");
                break;
        }
    }

    public void showVenue()
    {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        VenueResultAdapter venueResultAdapter = new VenueResultAdapter(this, list);
        recyclerView.setAdapter(venueResultAdapter);
    }
}
