package com.hypnoweb.hypnowebapp.di.modules

import android.content.Context
import com.hypnoweb.hypnowebapp.splashscreen.Navigator
import dagger.Module
import dagger.Provides


@Module
class NavigatorsModule {

    @Provides
    fun getShit(splashscreenactivity: Context): Navigator {
        return Navigator(splashscreenactivity)
    }
}