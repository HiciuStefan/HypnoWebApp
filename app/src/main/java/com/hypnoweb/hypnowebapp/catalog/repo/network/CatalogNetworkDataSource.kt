package com.hypnoweb.hypnowebapp.catalog.repo.network


import com.hypnoweb.hypnowebapp.catalog.Catalog
import io.reactivex.Single
import javax.inject.Inject

class CatalogNetworkDataSource @Inject constructor(private val catalogApi: CatalogApi, private val catalogNetworkMapper: CatalogNetworkMapper) {

    val catalog: Single<Catalog>
        get() = catalogApi.catalog
                .flatMap { catalogNetwork -> catalogNetworkMapper.fromNetworkCatalog(catalogNetwork) }
}