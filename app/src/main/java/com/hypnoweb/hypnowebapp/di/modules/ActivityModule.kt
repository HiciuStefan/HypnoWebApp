package com.hypnoweb.hypnowebapp.di.modules

import com.hypnoweb.hypnowebapp.splashscreen.SplashScreenActivity
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [FragmentBuilderModule::class])
    @ActivityKey(SplashScreenActivity::class)
    internal abstract fun contributeSplashActivity(): SplashScreenActivity


}