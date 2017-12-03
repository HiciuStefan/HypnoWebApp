package com.hypnoweb.hypnowebapp;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;


import com.hypnoweb.hypnowebapp.DI.HypnoWebApplication;
import com.hypnoweb.hypnowebapp.databinding.ActivityMainBinding;
import com.hypnoweb.hypnowebapp.splashscreen.SplashViewModel;

import javax.inject.Inject;

/**
 * Created by stefan on 12/3/2017.
 */

public class SplashScreenActivity extends Activity {

    @Inject
    SplashViewModel splashViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((HypnoWebApplication) getApplication()).getAppComponent().inject(this);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(splashViewModel);
    }
}
