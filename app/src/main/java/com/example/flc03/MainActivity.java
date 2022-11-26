package com.example.flc03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen.installSplashScreen(this);
        View content = findViewById(android.R.id.content);
        splash.start(content);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}