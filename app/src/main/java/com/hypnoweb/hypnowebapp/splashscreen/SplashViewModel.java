package com.hypnoweb.hypnowebapp.splashscreen;

import android.databinding.ObservableBoolean;

import javax.inject.Inject;

public class SplashViewModel {

    public ObservableBoolean loading = new ObservableBoolean();
    @Inject
    public SplashViewModel() {
        loading.set(true);
    }
}
