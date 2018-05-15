package com.hypnoweb.hypnowebapp.di.modules

import com.hypnoweb.hypnowebapp.ui.catalog.CatalogActivity
import com.hypnoweb.hypnowebapp.ui.splashscreen.SplashScreenActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = arrayOf(FragmentBuilderModule::class))
    abstract fun provideSplashScreenActivity(): SplashScreenActivity

    @ContributesAndroidInjector(modules = arrayOf())
    abstract fun provideCatalogActivity(): CatalogActivity

}