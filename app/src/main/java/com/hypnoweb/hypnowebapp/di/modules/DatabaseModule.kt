package com.hypnoweb.hypnowebapp.di.modules

import android.app.Application
import android.arch.persistence.room.Room
import com.hypnoweb.hypnowebapp.database.AppDatabase
import com.hypnoweb.hypnowebapp.database.movie.MoviesDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun getDataBase(context: Application): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "HypnoWebDataBase").build()
    }

    @Provides
    fun getCatalogDao(appDatabase: AppDatabase): MoviesDao {
        return appDatabase.catalogDao()
    }
}
