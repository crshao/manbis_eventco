package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;

import com.example.manbis_eventco.Adapter.CateringResultAdapter;
import com.example.manbis_eventco.Adapter.DecorationResultAdapter;
import com.example.manbis_eventco.Adapter.EntertainmentResultAdapter;
import com.example.manbis_eventco.Adapter.PhotoboothResultAdapter;
import com.example.manbis_eventco.Adapter.PhotographyResultAdapter;
import com.example.manbis_eventco.Adapter.VenueResultAdapter;
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
                ArrayList<Venue> listVenue = new ArrayList<Venue>();
                listVenue.addAll(VenueData.getVenueData());
                showVenue(listVenue);
                break;
            case "Catering":
                ArrayList<Catering> listCatering = new ArrayList<Catering>();
                listCatering.addAll(CateringData.getCateringData());
                showCatering(listCatering);
                break;
            case "Decoration & Lighting" :
                ArrayList<Decoration> listDecoration = new ArrayList<Decoration>();
                listDecoration.addAll(DecorationData.getDecorationData());
                showDecoration(listDecoration);
                break;
            case "Photography & Videography" :
                ArrayList<Photography> listPhotography = new ArrayList<Photography>();
                listPhotography.addAll(PhotographyData.getPhotographyData());
                showPhotography(listPhotography);
                break;
            case "Photobooth" :
                ArrayList<Photobooth> listPhotobooth = new ArrayList<Photobooth>();
                listPhotobooth.addAll(PhotoboothData.getPhotoboothData());
                showPhotobooth(listPhotobooth);
                break;
            case "Entertainment" :
                ArrayList<Entertainment> listEntertainment = new ArrayList<Entertainment>();
                listEntertainment.addAll(EntertainmentData.getEntertainmentData());
                showEntertainment(listEntertainment);
                break;
            default:
                System.out.println("MASUK KE DEFAULT");
                break;
        }
    }

    private void showEntertainment(ArrayList<Entertainment> listEntertainment) {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewSpacing itemDecoration = new RecycleViewSpacing(20);
        recyclerView.addItemDecoration(itemDecoration);
        EntertainmentResultAdapter entertainmentResultAdapter = new EntertainmentResultAdapter(listEntertainment,this);
        recyclerView.setAdapter(entertainmentResultAdapter);

    }

    private void showPhotobooth(ArrayList<Photobooth> listPhotobooth) {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewSpacing itemDecoration = new RecycleViewSpacing(20);
        recyclerView.addItemDecoration(itemDecoration);
        PhotoboothResultAdapter photoboothResultAdapter = new PhotoboothResultAdapter(listPhotobooth,this);
        recyclerView.setAdapter(photoboothResultAdapter);
    }

    private void showPhotography(ArrayList<Photography> listPhotography) {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewSpacing itemDecoration = new RecycleViewSpacing(20);
        recyclerView.addItemDecoration(itemDecoration);
        PhotographyResultAdapter photographyResultAdapter = new PhotographyResultAdapter(listPhotography,this);
        recyclerView.setAdapter(photographyResultAdapter);

    }

    private void showDecoration(ArrayList<Decoration> listDecoration) {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewSpacing itemDecoration = new RecycleViewSpacing(20);
        recyclerView.addItemDecoration(itemDecoration);
        DecorationResultAdapter decorationResultAdapter = new DecorationResultAdapter(listDecoration,this);
        recyclerView.setAdapter(decorationResultAdapter);

    }

    public void showVenue(ArrayList<Venue> listVenue)
    {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewSpacing itemDecoration = new RecycleViewSpacing(20);
        recyclerView.addItemDecoration(itemDecoration);
        VenueResultAdapter venueResultAdapter = new VenueResultAdapter(listVenue,this);
        recyclerView.setAdapter(venueResultAdapter);
    }

    public void showCatering(ArrayList<Catering> listCatering){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewSpacing itemDecoration = new RecycleViewSpacing(20);
        recyclerView.addItemDecoration(itemDecoration);
        CateringResultAdapter cateringResultAdapter = new CateringResultAdapter(listCatering,this);
        recyclerView.setAdapter(cateringResultAdapter);
    }

}
