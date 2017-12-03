package com.hypnoweb.hypnowebapp.DI.Modules;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by stefan on 12/3/2017.
 */

@Module
public class AppModule {

    private Context context;

    @Inject
    public AppModule(Context context) {
        this.context = context;
    }


    @Provides
    @Singleton
    Context provideContext() {
        return context;
    }
}
