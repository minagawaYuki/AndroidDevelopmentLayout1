package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuExercise extends AppCompatActivity {
    Button btnChanger, btnDefault;
    CardView cdButton, cdButtonDefault;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);

        btnChanger = findViewById(R.id.btnTransformingButton);
        btnChanger.setBackgroundColor(Color.YELLOW);
        btnDefault = findViewById(R.id.btnTransformingButtonDefault);
        btnDefault.setBackgroundColor(Color.YELLOW);
        btnDefault.setVisibility(View.GONE);
        cdButton = findViewById(R.id.cdButton);
        cdButtonDefault = findViewById(R.id.cdButtonDefault);
        cdButtonDefault.setVisibility(View.GONE);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_menuexercise, menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.mItemChange) {
            Toast.makeText(this, "Edit Object Item is clicked", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.itemChangeBgColor) {
            btnChanger.setBackgroundColor(Color.BLUE);
        }
        else if(item.getItemId() == R.id.itemSetText) {
            btnChanger.setText("This is a button text");
        }
        else if(item.getItemId() == R.id.itemHide) {
            btnChanger.setVisibility(View.GONE);
        }
        else if(item.getItemId() == R.id.itemChangeFontColor) {
            btnChanger.setTextColor(Color.WHITE);

        }
        else if(item.getItemId() == R.id.mItemReset) {
            Toast.makeText(this, "Reset Object Item is clicked", Toast.LENGTH_SHORT).show();
            btnChanger.setBackgroundColor(Color.YELLOW);
            btnChanger.setText("BUTTON");
            btnChanger.setVisibility(View.VISIBLE);
            btnChanger.setTextColor(Color.BLACK);
            cdButton.setRadius(456);
        }
        else if(item.getItemId() == R.id.itemChangeShape) {
            cdButton.setRadius(0);
        }
        else if(item.getItemId() == R.id.mItemExit) {
            finish();
        }
        return true;
    }
}