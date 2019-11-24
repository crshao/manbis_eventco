package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.OnClick;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    final static String TAG = "LoginActivity";

    @BindView(R.id.username_layout)
    TextInputLayout username;

    @BindView(R.id.password_layout)
    TextInputLayout password;

    @BindView(R.id.btn_login)
    MaterialButton btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SharedPreferences sharedPreferences = getSharedPreferences("pref", MODE_PRIVATE);


    }

    @OnClick
}
