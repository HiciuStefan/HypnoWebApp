package com.hypnoweb.hypnowebapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.hypnoweb.hypnowebapp.DI.AppDi;
import com.hypnoweb.hypnowebapp.DI.Components.DaggerAppComponent;
import com.hypnoweb.hypnowebapp.DI.Modules.AppModule;

import javax.inject.Inject;

/**
 * Created by stefan on 12/3/2017.
 */

public class SplashScreenActivity extends AppCompatActivity {

    @Inject
    AppModule appModule;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

    }
}
