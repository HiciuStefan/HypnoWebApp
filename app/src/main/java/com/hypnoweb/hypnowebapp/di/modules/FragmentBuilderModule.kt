package com.hypnoweb.hypnowebapp.di.modules

import com.hypnoweb.hypnowebapp.splashscreen.SplashScreenFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class FragmentBuilderModule {
    @ContributesAndroidInjector
    internal abstract fun contributeSplashScreenFragmentInjector(): SplashScreenFragment

}
