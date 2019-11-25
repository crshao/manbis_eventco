package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class List_Vendor extends AppCompatActivity {

    ListView listView;
 /*   ArrayList<String> list_vendor;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__vendor);
       /* for(int i = 0 ; i <  getResources().getStringArray(R.array.vendorList).length;i++){
            list_vendor.add(getResources().getStringArray(R.array.vendorList[i]))
        }*/

    listView = findViewById(R.id.list_view);

    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(List_Vendor.this,android.R.layout.simple_list_item_1
        ,getResources().getStringArray(R.array.vendorList));

    listView.setAdapter(arrayAdapter);
    }
}
