package com.hypnoweb.hypnowebapp.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.hypnoweb.hypnowebapp.database.movie.MovieDb
import com.hypnoweb.hypnowebapp.database.movie.MoviesDao

@Database(entities = [MovieDb::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun catalogDao(): MoviesDao
}
