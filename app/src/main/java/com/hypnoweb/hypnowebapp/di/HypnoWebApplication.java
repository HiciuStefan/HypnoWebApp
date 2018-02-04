package com.hypnoweb.hypnowebapp.di;

import com.hypnoweb.hypnowebapp.di.Components.AppComponent;
import com.hypnoweb.hypnowebapp.di.Components.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class HypnoWebApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent component = DaggerAppComponent.builder().application(this)
                .build();
        component.inject(this);
        return component;
    }

}
