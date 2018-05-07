package com.hypnoweb.hypnowebapp.database.movie

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import io.reactivex.Maybe

@Dao
interface MoviesDao {

    @get:Query("SELECT * FROM MovieDb")
    val all: Maybe<List<MovieDb>>

    @Query("SELECT * FROM MovieDb WHERE movieId IN (:movieIds)")
    fun loadAllByIds(movieIds: List<String>): Maybe<List<MovieDb>>

    @Query("SELECT * FROM MovieDb WHERE movieId = :searchedId")
    fun findMovieById(searchedId: String): Maybe<MovieDb>

    /* @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);*/
}
