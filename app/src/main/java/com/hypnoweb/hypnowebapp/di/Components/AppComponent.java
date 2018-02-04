package com.hypnoweb.hypnowebapp.di.Components;

import android.app.Application;

import com.hypnoweb.hypnowebapp.di.HypnoWebApplication;
import com.hypnoweb.hypnowebapp.di.modules.ActivityModule;
import com.hypnoweb.hypnowebapp.di.modules.AppModule;
import com.hypnoweb.hypnowebapp.di.modules.DatabaseModule;
import com.hypnoweb.hypnowebapp.di.modules.NetworkModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by stefan on 12/3/2017.
 */

@Component(modules = {AndroidInjectionModule.class, AppModule.class, NetworkModule.class, DatabaseModule.class, ActivityModule.class})
@Singleton
public interface AppComponent extends AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    @Override
    void inject(DaggerApplication application);
    void inject(HypnoWebApplication hypnoWebApplication);
}