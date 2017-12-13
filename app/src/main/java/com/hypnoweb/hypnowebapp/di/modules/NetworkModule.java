package com.hypnoweb.hypnowebapp.di.modules;

import com.hypnoweb.hypnowebapp.catalog.repo.network.CatalogApi;
import com.hypnoweb.hypnowebapp.networking.NetworkFactory;

import dagger.Module;
import dagger.Provides;

/**
 * Created by stefan on 12/3/2017.
 */

@Module
public class NetworkModule {

    public NetworkModule() {
    }


    @Provides
    public CatalogApi getCatalogApi(NetworkFactory networkFactory) {
        return networkFactory.getCatalogApi();
    }
}
