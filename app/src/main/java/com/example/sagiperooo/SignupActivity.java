package com.example.sagiperooo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Find the Create Account button
        Button createAccountBtn = findViewById(R.id.createAccountBtn);

        // Set click listener to navigate to WelcomePopupActivity
        createAccountBtn.setOnClickListener(view -> {
            Intent intent = new Intent(SignupActivity.this, WelcomePopupActivity.class);
            startActivity(intent);
        });
    }
}
