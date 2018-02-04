package com.hypnoweb.hypnowebapp.splashscreen;


import android.os.Bundle;
import android.support.annotation.Nullable;

import com.hypnoweb.hypnowebapp.R;

import dagger.android.support.DaggerAppCompatActivity;

public class SplashScreenActivity extends DaggerAppCompatActivity {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportFragmentManager().beginTransaction().replace(R.id.container, SplashScreenFragment.getInstance()).commit();

    }


    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onStop() {
        super.onStop();

    }

}
