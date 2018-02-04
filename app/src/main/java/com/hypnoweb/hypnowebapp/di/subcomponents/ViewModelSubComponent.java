package com.hypnoweb.hypnowebapp.di.subcomponents;


import com.hypnoweb.hypnowebapp.splashscreen.SplashViewModel;

import dagger.Subcomponent;

@Subcomponent
public interface ViewModelSubComponent {

    @Subcomponent.Builder
    interface Builder {
        ViewModelSubComponent build();
    }

    SplashViewModel splashViewModel();
}
