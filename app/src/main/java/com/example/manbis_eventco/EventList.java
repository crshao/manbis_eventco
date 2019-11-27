package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class EventList extends AppCompatActivity {

    @BindView(R.id.btn_wedding)
    MaterialButton btn_wedding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_wedding)
    public void move()
    {
        Intent intent = new Intent(this, ListVendor.class);
        startActivity(intent);
    }
}
