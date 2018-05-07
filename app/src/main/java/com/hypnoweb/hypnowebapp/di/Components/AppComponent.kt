package com.hypnoweb.hypnowebapp.di.Components

import android.app.Application
import com.hypnoweb.hypnowebapp.di.HypnoWebApplication
import com.hypnoweb.hypnowebapp.di.modules.ActivityModule
import com.hypnoweb.hypnowebapp.di.modules.DatabaseModule
import com.hypnoweb.hypnowebapp.di.modules.NetworkModule
import com.hypnoweb.hypnowebapp.di.modules.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Component(modules = [
AndroidSupportInjectionModule::class,
ViewModelModule::class,
NetworkModule::class,
DatabaseModule::class,
ActivityModule::class
])

@Singleton
interface AppComponent : AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    override fun inject(application: DaggerApplication?)
    fun inject(hypnoWebApplication: HypnoWebApplication)
}