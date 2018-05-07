package com.hypnoweb.hypnowebapp.catalog.repo;


import com.hypnoweb.hypnowebapp.catalog.repo.db.CatalogLocalDataSource;
import com.hypnoweb.hypnowebapp.catalog.repo.network.CatalogNetworkDataSource;

import javax.inject.Inject;

import io.reactivex.Single;

public class CatalogRepository {

    private CatalogNetworkDataSource catalogNetwork;
    private CatalogLocalDataSource catalogLocalDataSource;


    @Inject
    public CatalogRepository(CatalogNetworkDataSource catalogNetworkDataSource, CatalogLocalDataSource catalogLocalDataSource) {
        this.catalogNetwork = catalogNetworkDataSource;
        this.catalogLocalDataSource = catalogLocalDataSource;
    }


    public Single<com.hypnoweb.hypnowebapp.catalog.repo.Catalog> getCatalog() {
        return catalogNetwork.getCatalog();/*Single.concat(catalogLocalDataSource.getCatalog().toSingle(),
                catalogNetwork.getCatalog())
                .firstOrError();*/
    }

}
