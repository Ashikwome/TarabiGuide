package com.example.trabiguide;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class More extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
