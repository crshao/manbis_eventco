package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class EventList extends AppCompatActivity {

    @BindView(R.id.btn_wedding)
    MaterialButton btn_wedding;

//    @BindView(R.id.test)
//    TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);
        ButterKnife.bind(this);

//        SharedPreferences preference = getSharedPreferences("pref", MODE_PRIVATE);
//        String name = preference.getString("username", "");
//        String text = "Hello " + name;
//        test.setText(text);
    }

    @OnClick(R.id.btn_wedding)
    public void move()
    {
        Intent intent = new Intent(this, ListVendor.class);
        startActivity(intent);
    }
}
