package com.hypnoweb.hypnowebapp.DI.Components;

import com.hypnoweb.hypnowebapp.DI.Modules.AppModule;
import com.hypnoweb.hypnowebapp.SplashScreenActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by stefan on 12/3/2017.
 */

@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {
    void inject(SplashScreenActivity splashScreenActivity);
}
