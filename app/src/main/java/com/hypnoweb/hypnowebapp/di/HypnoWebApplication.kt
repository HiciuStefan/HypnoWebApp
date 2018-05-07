package com.hypnoweb.hypnowebapp.di

import com.hypnoweb.hypnowebapp.di.Components.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class HypnoWebApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val component = DaggerAppComponent.builder().application(this).build()
        component.inject(this)
        return component
    }

}