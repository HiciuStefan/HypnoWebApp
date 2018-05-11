package com.hypnoweb.hypnowebapp.catalog.repo.network

import com.hypnoweb.hypnowebapp.catalog.Catalog
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject


class CatalogNetworkMapper @Inject constructor() {

    fun fromNetworkCatalog(catalogNetwork: CatalogNetwork): Single<Catalog> {
        return Observable.just(catalogNetwork.movies!!)
                .flatMapIterable { it }
                .map { Catalog.Movie(it.movieId, it.shortTitle, it.biggerTitle, it.movieTypeId, it.banner) }
                .toList()
                .map { Catalog(it) }
    }
}
