package com.example.trabiguide;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Hadis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
