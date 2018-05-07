package com.hypnoweb.hypnowebapp.di.modules

import com.hypnoweb.hypnowebapp.catalog.repo.network.CatalogApi
import com.hypnoweb.hypnowebapp.networking.NetworkFactory
import dagger.Module
import dagger.Provides


@Module
class NetworkModule {

    @Provides
    fun getCatalogApi(networkFactory: NetworkFactory): CatalogApi {
        return networkFactory.catalogApi
    }
}
