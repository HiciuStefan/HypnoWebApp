package com.hypnoweb.hypnowebapp.catalog.repo.db

import com.hypnoweb.hypnowebapp.catalog.Catalog
import com.hypnoweb.hypnowebapp.database.movie.MovieDb
import io.reactivex.Maybe
import io.reactivex.Observable
import javax.inject.Inject

class CatalogDatabaseMapper @Inject constructor() {

    fun fromDataBase(databaseMovies: List<MovieDb>): Maybe<Catalog> {
        return Observable.just(databaseMovies).flatMapIterable { movieDbs -> movieDbs }
                .map { dbMovie -> Catalog.Movie(dbMovie.movieId, dbMovie.shortTitle, dbMovie.biggerTitle, dbMovie.movieTypeId, dbMovie.banner) }
                .toList()
                .flatMapMaybe { movies -> Maybe.just(Catalog(movies)) }
        /* List<Catalog.Movie> movies = new ArrayList<>();
            for (MovieDb dbMovie : databaseMovies) {
                movies.add(new Catalog.Movie(dbMovie.getMovieId(), dbMovie.getShortTitle(), dbMovie.getBiggerTitle(), dbMovie.getMovieTypeId(), dbMovie.getBanner()));
            }
            return Single.just(new Catalog(movies));*/
    }
}
