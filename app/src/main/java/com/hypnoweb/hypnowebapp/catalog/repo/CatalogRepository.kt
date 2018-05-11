package com.hypnoweb.hypnowebapp.catalog.repo

import com.hypnoweb.hypnowebapp.catalog.Catalog
import com.hypnoweb.hypnowebapp.catalog.repo.db.CatalogLocalDataSource
import com.hypnoweb.hypnowebapp.catalog.repo.network.CatalogNetworkDataSource
import io.reactivex.Single
import javax.inject.Inject

class CatalogRepository @Inject
constructor(private val catalogNetwork: CatalogNetworkDataSource, private val catalogLocalDataSource: CatalogLocalDataSource) {
    val catalog: Single<Catalog>
        get() = catalogNetwork.catalog

    /*Single.concat(catalogLocalDataSource.getCatalog().toSingle(),
            catalogNetwork.getCatalog())
            .firstOrError();*/
}