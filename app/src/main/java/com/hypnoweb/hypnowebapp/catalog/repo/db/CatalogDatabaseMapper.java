package com.hypnoweb.hypnowebapp.catalog.repo.db;

import com.hypnoweb.hypnowebapp.catalog.repo.Catalog;
import com.hypnoweb.hypnowebapp.database.movie.MovieDb;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Maybe;
import io.reactivex.Observable;


class CatalogDatabaseMapper {

    @Inject
    public CatalogDatabaseMapper() {
    }

    public Maybe<Catalog> fromDataBase(List<MovieDb> databaseMovies) {
        return Observable.just(databaseMovies).flatMapIterable(movieDbs -> movieDbs)
                .map(dbMovie -> new Catalog.Movie(dbMovie.getMovieId(), dbMovie.getShortTitle(), dbMovie.getBiggerTitle(), dbMovie.getMovieTypeId(), dbMovie.getBanner()))
                .toList()
                .flatMapMaybe(movies -> Maybe.just(new Catalog(movies)));
       /* List<Catalog.Movie> movies = new ArrayList<>();
        for (MovieDb dbMovie : databaseMovies) {
            movies.add(new Catalog.Movie(dbMovie.getMovieId(), dbMovie.getShortTitle(), dbMovie.getBiggerTitle(), dbMovie.getMovieTypeId(), dbMovie.getBanner()));
        }
        return Single.just(new Catalog(movies));*/
    }
}
