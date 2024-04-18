package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class PassingIntentsExercise2 extends AppCompatActivity {

    TextView tFname, tLname, tGender, tBdate, tPnum, tEmail, tCountry, tAddress, tProvince, tCity,
                tCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        tFname = (TextView) findViewById(R.id.txtPI2Fname);
        tLname = (TextView) findViewById(R.id.txtPI2Lname);
        tGender = (TextView) findViewById(R.id.txtPI2Gender);
        tBdate = (TextView) findViewById(R.id.txtPI2BDate);
        tPnum = (TextView) findViewById(R.id.txtPI2Number);
        tEmail = (TextView) findViewById(R.id.txtPI2Email);
        tCountry = (TextView) findViewById(R.id.txtPI2Country);
        tAddress = (TextView) findViewById(R.id.txtPI2Address);
        tProvince = (TextView) findViewById(R.id.txtPI2Province);
        tCity = (TextView) findViewById(R.id.txtPI2City);
        tCode = (TextView) findViewById(R.id.txtPI2Code);

        Intent intent = getIntent();

        String fname = intent.getStringExtra("fname_key");
        String lname = intent.getStringExtra("lname_key");
        String gender = intent.getStringExtra("gender_key");
        String bdate = intent.getStringExtra("bdate_key");
        String pnum = intent.getStringExtra("pnum_key");
        String email = intent.getStringExtra("eadd_key");
        String country = intent.getStringExtra("country_key");
        String address = intent.getStringExtra("address_key");
        String province = intent.getStringExtra("province_key");
        String city = intent.getStringExtra("city_key");
        String code = intent.getStringExtra("code_key");

        tFname.setText(fname);  tLname.setText(lname);
        tGender.setText(gender);  tBdate.setText(bdate);
        tPnum.setText(pnum);  tEmail.setText(email);
        tCountry.setText(country);  tAddress.setText(address);
        tProvince.setText(province);  tCity.setText(city);
        tCode.setText(code);

    }
}