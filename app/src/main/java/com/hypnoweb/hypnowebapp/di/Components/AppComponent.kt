package com.hypnoweb.hypnowebapp.di.components

import android.app.Application
import com.hypnoweb.hypnowebapp.di.HypnoWebApplication
import com.hypnoweb.hypnowebapp.di.modules.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton


@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        ViewModelModule::class,
        NetworkModule::class,
        DatabaseModule::class,
        ActivityModule::class,
        FragmentBuilderModule::class,
        NavigatorModule::class))

@Singleton
interface AppComponent : AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    override fun inject(application: DaggerApplication)
    fun inject(hypnoWebApplication: HypnoWebApplication)

}