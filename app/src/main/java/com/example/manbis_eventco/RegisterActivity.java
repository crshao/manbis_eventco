package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.OnClick;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity {

    private final static String TAG = "RegitsterActivity";

    @BindView(R.id.username_layout)
    TextInputLayout username;

    @BindView(R.id.email_layout)
    TextInputLayout email;

    @BindView(R.id.password_layout)
    TextInputLayout password;

    @BindView(R.id.phonenum_layout)
    TextInputLayout phonenum;

    @BindView(R.id.btn_register)
    MaterialButton btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    @OnClick()
    void register(View view)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("pref", MODE_PRIVATE);
        String newUser = username.getEditText().getText().toString();
        String newPass = password.getEditText().getText().toString();
        String newPhone = phonenum.getEditText().getText().toString();
        String newEmail = email.getEditText().getText().toString();

        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(newUser + newPass + "data", newUser + "\n" + newPhone + "\n" + newEmail);
        editor.commit();

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
