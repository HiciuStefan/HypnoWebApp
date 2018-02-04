package com.hypnoweb.hypnowebapp.di.modules;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.hypnoweb.hypnowebapp.database.AppDatabase;
import com.hypnoweb.hypnowebapp.database.movie.MoviesDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by stefan on 12/13/2017.
 */

@Module
public class DatabaseModule {

    public DatabaseModule() {
    }

    @Provides
    @Singleton
    public AppDatabase getDataBase(Application context) {
        return Room.databaseBuilder(context, AppDatabase.class, "HypnoWebDataBase").build();
    }

    @Provides
    public MoviesDao getCatalogDao(AppDatabase appDatabase) {
        return appDatabase.catalogDao();
    }
}
