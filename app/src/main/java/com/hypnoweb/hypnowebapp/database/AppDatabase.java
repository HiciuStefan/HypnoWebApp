package com.hypnoweb.hypnowebapp.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.hypnoweb.hypnowebapp.database.movie.MovieDb;
import com.hypnoweb.hypnowebapp.database.movie.MoviesDao;

/**
 * Created by stefan on 12/13/2017.
 */
@Database(entities = {MovieDb.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MoviesDao catalogDao();
}
