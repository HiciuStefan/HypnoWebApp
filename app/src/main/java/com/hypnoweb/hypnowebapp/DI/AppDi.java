package com.hypnoweb.hypnowebapp.DI;

import android.app.Application;

import com.hypnoweb.hypnowebapp.DI.Components.AppComponent;
import com.hypnoweb.hypnowebapp.DI.Components.DaggerAppComponent;
import com.hypnoweb.hypnowebapp.DI.Modules.AppModule;

/**
 * Created by stefan on 12/3/2017.
 */

public class AppDi extends Application{

    private static AppComponent appComponent;

    public static AppComponent getAppComponent(){
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = buildComponent();
    }

    private AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}
