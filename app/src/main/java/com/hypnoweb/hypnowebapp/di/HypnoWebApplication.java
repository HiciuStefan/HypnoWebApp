package com.hypnoweb.hypnowebapp.di;

import android.app.Application;

import com.hypnoweb.hypnowebapp.di.Components.AppComponent;
import com.hypnoweb.hypnowebapp.di.Components.DaggerAppComponent;
import com.hypnoweb.hypnowebapp.di.modules.AppModule;
import com.hypnoweb.hypnowebapp.di.modules.DatabaseModule;
import com.hypnoweb.hypnowebapp.di.modules.NetworkModule;

/**
 * Created by stefan on 12/3/2017.
 */

public class HypnoWebApplication extends Application {

    private AppComponent appComponent;

    public AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = buildComponent();
    }

    protected AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(HypnoWebApplication.this))
                .networkModule(new NetworkModule())
                .databaseModule(new DatabaseModule())
                .build();
    }
}
