package com.hypnoweb.hypnowebapp.database.movie;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

import io.reactivex.Maybe;

@Dao
public interface MoviesDao {

    @Query("SELECT * FROM MovieDb")
    Maybe<List<MovieDb>> getAll();

    @Query("SELECT * FROM MovieDb WHERE movieId IN (:movieIds)")
    Maybe<List<MovieDb>> loadAllByIds(List<String> movieIds);

    @Query("SELECT * FROM MovieDb WHERE movieId = :searchedId")
    Maybe<MovieDb> findMovieById(String searchedId);

   /* @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);*/
}
