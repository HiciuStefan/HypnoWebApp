package com.hypnoweb.hypnowebapp.database.movie;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by stefan on 12/9/2017.
 */

@Entity
public class MovieDb {

    @PrimaryKey
    private int idPrimary;
    @ColumnInfo(name = "movieId")
    public String movieId;
    @ColumnInfo(name = "shortTitle")
    private String shortTitle;
    @ColumnInfo(name = "biggerTitle")
    private String biggerTitle;
    @ColumnInfo(name = "movieTypeId")
    private String movieTypeId;
    @ColumnInfo(name = "banner")
    private String banner;


    public int getIdPrimary() {
        return idPrimary;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public String getBiggerTitle() {
        return biggerTitle;
    }

    public String getMovieTypeId() {
        return movieTypeId;
    }

    public String getBanner() {
        return banner;
    }

    public void setIdPrimary(int idPrimary) {
        this.idPrimary = idPrimary;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public void setBiggerTitle(String biggerTitle) {
        this.biggerTitle = biggerTitle;
    }

    public void setMovieTypeId(String movieTypeId) {
        this.movieTypeId = movieTypeId;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }
}
