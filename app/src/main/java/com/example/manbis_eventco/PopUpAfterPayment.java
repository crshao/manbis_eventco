package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;

import com.google.android.material.textview.MaterialTextView;

public class PopUpAfterPayment extends Activity {

    @BindView(R.id.tv1)
    MaterialTextView tv1;

    @BindView(R.id.tv2)
    MaterialTextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_after_payment);
        ButterKnife.bind(this);

        SharedPreferences preference = getSharedPreferences("pref", MODE_PRIVATE);
        String name = preference.getString("username", "");
        String text = "Congratulation " + name + ".\nYour booking has just been made!\n" +
                      "Here is your Booking ID: 255148785";

        String screenshoot = "Please take a screenshot.";

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;

        getWindow().setLayout((int) (width*.8), (int) (height*.6));

        tv1.setText(text);
        tv2.setText(screenshoot);
    }
}
