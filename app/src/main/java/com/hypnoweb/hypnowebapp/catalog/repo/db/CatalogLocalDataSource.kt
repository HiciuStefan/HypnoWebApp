package com.hypnoweb.hypnowebapp.catalog.repo.db

import com.hypnoweb.hypnowebapp.catalog.Catalog
import com.hypnoweb.hypnowebapp.database.movie.MoviesDao
import io.reactivex.Maybe
import javax.inject.Inject

class CatalogLocalDataSource @Inject constructor(private val moviesDao: MoviesDao,
                                                 private val catalogDatabaseMapper: CatalogDatabaseMapper) {


    val catalog: Maybe<Catalog>
        get() = moviesDao.all
                .flatMap { databaseMovies -> catalogDatabaseMapper.fromDataBase(databaseMovies) }

}