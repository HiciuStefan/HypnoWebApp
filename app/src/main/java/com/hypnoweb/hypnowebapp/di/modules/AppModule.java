package com.hypnoweb.hypnowebapp.di.modules;

import android.arch.lifecycle.ViewModelProvider;

import com.hypnoweb.hypnowebapp.di.ViewModelFactory.ProjectViewModelFactory;
import com.hypnoweb.hypnowebapp.di.subcomponents.ViewModelSubComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module(subcomponents = ViewModelSubComponent.class)
public class AppModule {

    @Singleton
    @Provides
    ViewModelProvider.Factory provideViewModelFactory(ViewModelSubComponent.Builder viewModelSubComponent) {
        return new ProjectViewModelFactory(viewModelSubComponent.build());
    }
}
