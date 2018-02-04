package com.hypnoweb.hypnowebapp.di.modules;


import com.hypnoweb.hypnowebapp.splashscreen.SplashScreenFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuilderModule {
    @ContributesAndroidInjector
    abstract SplashScreenFragment contributeSplashScreenFragmentInjector();

}
