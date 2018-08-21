package com.example.pals.keralatours;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BeachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        setContentView(R.layout.activity_beach);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new BeachFragment()).commit();

    }
}
