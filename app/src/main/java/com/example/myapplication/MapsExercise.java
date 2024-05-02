package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MapsExercise extends AppCompatActivity {
    ImageButton btnHermitsCove, btnParian, btnCcnshs, btnSimala, btnBoracay;
    ConstraintLayout constraintLayout;
    LinearLayout linearLayout;
    Drawable imgHermitsCove, imgParian, imgCcnshs, imgSimala, imgBoracay;
    TextView titleMap;
    ImageView backgroundMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_exercise);

        btnHermitsCove = (ImageButton) findViewById(R.id.btnHermitsCove);
        btnParian = (ImageButton) findViewById(R.id.btnParian);
        btnCcnshs = (ImageButton) findViewById(R.id.btnCcnshs);
        btnSimala = (ImageButton) findViewById(R.id.btnSimala);
        btnBoracay = (ImageButton) findViewById(R.id.btnBoracay);
        constraintLayout = (ConstraintLayout) findViewById(R.id.mapsExercise);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        titleMap = (TextView) findViewById(R.id.titleMap);
        titleMap.setText("Hermit's Cove");
        imgHermitsCove = ContextCompat.getDrawable(this.getBaseContext(), R.drawable.hermitscove);
        imgParian = ContextCompat.getDrawable(this.getBaseContext(), R.drawable.parian);
        imgCcnshs = ContextCompat.getDrawable(this.getBaseContext(), R.drawable.ccnshs);
        imgSimala = ContextCompat.getDrawable(this.getBaseContext(), R.drawable.simala);
        imgBoracay = ContextCompat.getDrawable(this.getBaseContext(), R.drawable.boracay);
        backgroundMaps = (ImageView) findViewById(R.id.backgroundMaps);


        btnHermitsCove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundMaps.setImageResource(R.drawable.hermitscove1);
                titleMap.setText("Hermit's Cove");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 10.2016021,123.533814"));
                startActivity(intent);
            }
        });
        btnParian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundMaps.setImageResource(R.drawable.parian1);
                titleMap.setText("Pari-an");
            }
        });
        btnCcnshs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundMaps.setImageResource(R.drawable.ccnshs);
                titleMap.setText("CCNSHS");
            }
        });
        btnSimala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundMaps.setImageResource(R.drawable.simala1);
                titleMap.setText("Simala");
            }
        });
        btnBoracay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundMaps.setImageResource(R.drawable.boracay1);
                titleMap.setText("Boracay");
            }
        });
    }
}