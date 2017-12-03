package com.hypnoweb.hypnowebapp.DI;

import android.app.Application;

import com.hypnoweb.hypnowebapp.DI.Components.AppComponent;
import com.hypnoweb.hypnowebapp.DI.Components.DaggerAppComponent;
import com.hypnoweb.hypnowebapp.DI.Modules.AppModule;

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
                .build();
    }
}
