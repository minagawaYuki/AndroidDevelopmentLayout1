package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.ButtonExercise;
import com.example.myapplication.CalculatorActivity;
import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btnInstagram);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this, InstagramApp.class
                );
                startActivity(intent1);
            }
        });


        btn2 = (Button) findViewById(R.id.btnButtonExercise);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this, ButtonExercise.class
                );
                startActivity(intent1);
            }
        });
        btn3 = (Button) findViewById(R.id.btnCalculator);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(intent1);
            }

        });
        btn5 = (Button) findViewById(R.id.btnPassingIntents);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this, PassingIntentsExercise.class
                );
                startActivity(intent1);
            }
        });

    }
}