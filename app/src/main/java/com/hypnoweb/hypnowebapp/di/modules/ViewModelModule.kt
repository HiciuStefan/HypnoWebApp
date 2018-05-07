package com.hypnoweb.hypnowebapp.di.modules

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.hypnoweb.hypnowebapp.di.ViewModelFactory.ViewModelFactory
import com.hypnoweb.hypnowebapp.di.annotations.ViewModelKey
import com.hypnoweb.hypnowebapp.splashscreen.SplashViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    internal abstract fun bindAndevClientViewModel(viewModel: SplashViewModel): ViewModel


    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
