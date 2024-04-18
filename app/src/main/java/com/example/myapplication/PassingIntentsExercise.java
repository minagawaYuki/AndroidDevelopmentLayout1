package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class PassingIntentsExercise extends AppCompatActivity {

    EditText eFName, eLName, eBDate, eNumber, eEmail, eCountry, eAddress,
            eProvince, eCity, eCode;
    RadioButton rMale, rFemale, rOthers;
    Button btnClear, btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);

        eFName = (EditText) findViewById(R.id.inputFirstName);
        eLName = (EditText) findViewById(R.id.inputLastName);
        rMale = (RadioButton) findViewById(R.id.btnMale);
        rFemale = (RadioButton) findViewById(R.id.btnFemale);
        rOthers = (RadioButton) findViewById(R.id.btnOthers);
        eBDate = (EditText) findViewById(R.id.inputBirthDate);
        eNumber = (EditText) findViewById(R.id.inputPhoneNumber);
        eEmail = (EditText) findViewById(R.id.inputEmail);
        eCountry = (EditText) findViewById(R.id.inputCountry);
        eAddress = (EditText) findViewById(R.id.inputAddress);
        eProvince = (EditText) findViewById(R.id.inputProvince);
        eCity = (EditText) findViewById(R.id.inputCity);
        eCode = (EditText) findViewById(R.id.inputCode);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eFName.setText("");
                eLName.setText("");
                rMale.setChecked(false);
                rFemale.setChecked(false);
                rOthers.setChecked(false);
                eBDate.setText("");
                eNumber.setText("");
                eEmail.setText("");
                eCountry.setText("");
                eAddress.setText("");
                eProvince.setText("");
                eCity.setText("");
                eCode.setText("");
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = eFName.getText().toString();
                String lname = eLName.getText().toString();

                String gender;
                if(rMale.isChecked()) {
                    gender = "Male";
                }
                else if(rFemale.isChecked()) {
                    gender = "Female";
                }
                else if(rOthers.isChecked()) {
                    gender = "Others";
                }
                else {
                    gender = "Unknown";
                }

                String bDate = eBDate.getText().toString();
                String pNumber = eNumber.getText().toString();
                String emailAdd = eEmail.getText().toString();
                String country = eCountry.getText().toString();
                String address = eAddress.getText().toString();
                String province = eProvince.getText().toString();
                String city = eCity.getText().toString();
                String code = eCode.getText().toString();

                Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
                intent.putExtra("fname_key", fname);    intent.putExtra("lname_key", lname);
                intent.putExtra("gender_key", gender);    intent.putExtra("bdate_key", bDate);
                intent.putExtra("pnum_key", pNumber);    intent.putExtra("eadd_key", emailAdd);
                intent.putExtra("country_key", country);    intent.putExtra("address_key", address);
                intent.putExtra("province_key", province);    intent.putExtra("city_key", city);
                intent.putExtra("code_key", code);

                startActivity(intent);

            }
        });
    }
}