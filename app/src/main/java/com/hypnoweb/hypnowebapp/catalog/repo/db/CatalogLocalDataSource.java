package com.hypnoweb.hypnowebapp.catalog.repo.db;


import com.hypnoweb.hypnowebapp.catalog.repo.Catalog;
import com.hypnoweb.hypnowebapp.database.movie.MoviesDao;

import javax.inject.Inject;

import io.reactivex.Maybe;

public class CatalogLocalDataSource {

    private MoviesDao moviesDao;
    private CatalogDatabaseMapper catalogDatabaseMapper;


    @Inject
    public CatalogLocalDataSource(MoviesDao moviesDao, CatalogDatabaseMapper catalogDatabaseMapper) {
        this.moviesDao = moviesDao;
        this.catalogDatabaseMapper = catalogDatabaseMapper;
    }


    public Maybe<Catalog> getCatalog() {
        return moviesDao.getAll()
                .flatMap(databaseMovies -> catalogDatabaseMapper.fromDataBase(databaseMovies));
    }

}






    