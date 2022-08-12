package com.example.enfocement_app.Activities;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;


import com.example.enfocement_app.Managers.ApplicationManager;
import com.example.enfocement_app.R;

public class splash_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.car_sound);
        ApplicationManager.getInstance().Init(getApplicationContext());
        mediaPlayer.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // This method will be executed once the timer is over
                //   Intent i = new Intent(SplashActivity.this, Third_party.class);
                Intent i = new Intent(splash_Activity.this, Login_activity.class);

                startActivity(i);
                finish();
            }
        }, 2000);
    }
}
