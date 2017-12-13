package com.hypnoweb.hypnowebapp.catalog.repo.network;

import com.hypnoweb.hypnowebapp.catalog.repo.Catalog;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Single;

class CatalogNetworkMapper {

    @Inject
    public CatalogNetworkMapper() {
    }

    public Single<Catalog> fromNetworkCatalog(CatalogNetwork catalogNetwork) {
        return Observable.just(catalogNetwork.getMovies())
                .flatMapIterable(moviesNetwork -> moviesNetwork)
                .map(movieNetwork -> new Catalog.Movie(movieNetwork.getMovieId(), movieNetwork.getShortTitle(), movieNetwork.getBiggerTitle(), movieNetwork.getMovieTypeId(), movieNetwork.getBanner()))
                .toList()
                .map(Catalog::new);
    }
}
