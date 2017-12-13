package com.hypnoweb.hypnowebapp.catalog.repo.network;

import com.hypnoweb.hypnowebapp.catalog.repo.Catalog;

import javax.inject.Inject;

import io.reactivex.Single;

/**
 * Created by stefan on 12/9/2017.
 */

public class CatalogNetworkDataSource {

    private CatalogApi catalogApi;
    private CatalogNetworkMapper catalogNetworkMapper;

    @Inject
    public CatalogNetworkDataSource(CatalogApi catalogApi, CatalogNetworkMapper catalogNetworkMapper) {
        this.catalogApi = catalogApi;
        this.catalogNetworkMapper = catalogNetworkMapper;
    }


    public Single<Catalog> getCatalog() {
        return catalogApi.getCatalog()
                .flatMap(catalogNetwork -> catalogNetworkMapper.fromNetworkCatalog(catalogNetwork));
    }
}
