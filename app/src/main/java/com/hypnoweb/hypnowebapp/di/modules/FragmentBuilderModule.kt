package com.hypnoweb.hypnowebapp.di.modules

import com.hypnoweb.hypnowebapp.ui.splashscreen.SplashScreenFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class FragmentBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeSplashScreenFragmentInjector(): SplashScreenFragment

}
