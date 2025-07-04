package com.example.sagiperooo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainPageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page); // Make sure this XML exists

        // FIRE BUTTON
        ImageView iconFire = findViewById(R.id.iconFire);
        TextView textFire = findViewById(R.id.textFire);
        View.OnClickListener fireClickListener = v -> {
            Intent intent = new Intent(MainPageActivity.this, FireAlertActivity.class);
            startActivity(intent);
        };
        iconFire.setOnClickListener(fireClickListener);
        textFire.setOnClickListener(fireClickListener);

        // FLOOD BUTTON
        ImageView iconFlood = findViewById(R.id.iconFlood);
        TextView textFlood = findViewById(R.id.textFlood);
        View.OnClickListener floodClickListener = v -> {
            Intent intent = new Intent(MainPageActivity.this, FloodAlertActivity.class);
            startActivity(intent);
        };
        iconFlood.setOnClickListener(floodClickListener);
        textFlood.setOnClickListener(floodClickListener);

        // EARTHQUAKE BUTTON
        ImageView iconEarthquake = findViewById(R.id.iconEarthquake);
        TextView textEarthquake = findViewById(R.id.textEarthquake);
        View.OnClickListener earthquakeClickListener = v -> {
            Intent intent = new Intent(MainPageActivity.this, EarthquakeAlertActivity.class);
            startActivity(intent);
        };
        iconEarthquake.setOnClickListener(earthquakeClickListener);
        textEarthquake.setOnClickListener(earthquakeClickListener);
    }
}
