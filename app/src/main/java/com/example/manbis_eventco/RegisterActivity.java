package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.OnClick;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity {

    private final static String TAG = "RegitsterActivity";

    @BindView(R.id.)

    @BindView(R.id.)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    @OnClick()
    void register()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("pref", MODE_PRIVATE);
        String newUser;
        String newPass;
        String newPhone;
        String newEmail;
    }
}
