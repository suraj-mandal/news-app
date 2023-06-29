package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class splashscreen extends AppCompatActivity {

    private static final int SPLASH_TIMEOUT = 10000; // 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        // Delayed execution of the next activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the next activity
                Intent intent = new Intent(splashscreen.this, MainActivity.class);
                startActivity(intent);

                // Finish the splash screen activity
                finish();
            }
        }, SPLASH_TIMEOUT);
    }
}
