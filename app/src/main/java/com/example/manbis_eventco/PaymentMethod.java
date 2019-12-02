package com.example.manbis_eventco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;
import com.google.android.material.button.MaterialButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PaymentMethod extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @BindView(R.id.button)
    MaterialButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);
        ButterKnife.bind(this);

        Spinner spinnerBank = findViewById(R.id.spinnerBank);
        ArrayAdapter<CharSequence> adapterBank = ArrayAdapter.createFromResource(this, R.array.Transfer, android.R.layout.simple_spinner_item);
        adapterBank.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerBank.setAdapter(adapterBank);
        spinnerBank.setOnItemSelectedListener(this);

        Spinner spinnerCC = findViewById(R.id.spinnerCC);
        ArrayAdapter<CharSequence> adapterCC = ArrayAdapter.createFromResource(this, R.array.CreditCard, android.R.layout.simple_spinner_item);
        adapterCC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCC.setAdapter(adapterCC);
        spinnerCC.setOnItemSelectedListener(this);

        Spinner spinnerATM = findViewById(R.id.spinnerATM);
        ArrayAdapter<CharSequence> adapterATM = ArrayAdapter.createFromResource(this, R.array.ATM, android.R.layout.simple_spinner_item);
        adapterATM.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerATM.setAdapter(adapterATM);
        spinnerATM.setOnItemSelectedListener(this);

        Spinner spinnerCashier = findViewById(R.id.spinnerCashier);
        ArrayAdapter<CharSequence> adapterCashier = ArrayAdapter.createFromResource(this, R.array.Cashier, android.R.layout.simple_spinner_item);
        adapterCashier.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCashier.setAdapter(adapterCashier);
        spinnerCashier.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString().trim();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @OnClick(R.id.button)
    public void move()
    {
        Intent intent = new Intent(this, PopUpAfterPayment.class);
        startActivity(intent);
    }
}
