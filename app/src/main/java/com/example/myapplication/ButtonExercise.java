package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.ReturnActivity;
import com.google.android.material.button.MaterialButtonToggleGroup;

public class ButtonExercise extends AppCompatActivity {

    Button btnClose, btnToast, btnChangeBackground, btnChangeButtonBackground, btnDisappear;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        btnClose = (Button) findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ButtonExercise.this, ReturnActivity.class));
            }
        });
        btnToast = (Button) findViewById(R.id.btnToast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "The button is clicked.",Toast.LENGTH_SHORT).show();
            }
        });
        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);

        btnChangeBackground = (Button) findViewById(R.id.btnChangeBackground);
        btnChangeBackground.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                constraintLayout.setBackgroundColor(Color.BLUE);
            }
        });
        btnChangeButtonBackground = (Button) findViewById(R.id.btnChangeButtonBackground);
        btnChangeButtonBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnChangeButtonBackground.setBackgroundColor(Color.RED);
            }
        });
        btnDisappear = (Button) findViewById(R.id.btnDisappear);
        btnDisappear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnDisappear.setVisibility(View.GONE);
            }
        });

    }
}