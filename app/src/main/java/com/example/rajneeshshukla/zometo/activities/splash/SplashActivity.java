package com.example.rajneeshshukla.zometo.activities.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rajneeshshukla.zometo.HomeActivity;
import com.example.rajneeshshukla.zometo.R;
import com.example.rajneeshshukla.zometo.activities.home.MainActivity;

/**
 *  Class  is used to display Splash on start of the app
 */
public class SplashActivity extends AppCompatActivity {

    final private int SPLASH_SCREEN_TIMEOUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        showSpalsh();
    }

    /* Display Spalsh screen and than move to Main screen */
    private void showSpalsh() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(i);
            }
        }, SPLASH_SCREEN_TIMEOUT);
    }
    }

