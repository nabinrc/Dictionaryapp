package com.e.dictionaryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashBoard extends AppCompatActivity {
    Button btnOpenDictionary,btnOpenCountry,btnCallme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnOpenCountry = findViewById(R.id.btnOpenCountry);
        btnOpenDictionary = findViewById(R.id.btnOpenDictionary);
        btnCallme = findViewById(R.id.btnCallme);

        btnOpenDictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this, MainActivity.class);
                startActivity(intent);

            }
        });

        btnOpenCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this, AddcountryActivity.class);
                startActivity(intent);
            }
        });
        btnCallme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoard.this, DialActivity.class);
                startActivity(intent);
            }
        });
    }
}