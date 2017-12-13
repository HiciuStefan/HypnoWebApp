package com.hypnoweb.hypnowebapp.di.Components;

import com.hypnoweb.hypnowebapp.SplashScreenActivity;
import com.hypnoweb.hypnowebapp.di.modules.AppModule;
import com.hypnoweb.hypnowebapp.di.modules.DatabaseModule;
import com.hypnoweb.hypnowebapp.di.modules.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by stefan on 12/3/2017.
 */

@Component(modules = {AppModule.class, NetworkModule.class, DatabaseModule.class})
@Singleton
public interface AppComponent {
    void inject(SplashScreenActivity splashScreenActivity);
}