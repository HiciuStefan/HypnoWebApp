package com.hypnoweb.hypnowebapp.catalog.repo.network;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by stefan on 12/9/2017.
 */

public class CatalogNetwork {

    @SerializedName("records")
    private final ArrayList<MovieNetwork> movies;

    CatalogNetwork() {
        movies = null;
    }

    public ArrayList<MovieNetwork> getMovies() {
        return movies;
    }

    static class MovieNetwork {
        @SerializedName("id")
        private String movieId;
        @SerializedName("title_vo")
        private String shortTitle;
        @SerializedName("title_vf")
        private String biggerTitle;
        @SerializedName("category_id")
        private String movieTypeId;
        @SerializedName("banner_url")
        private String banner;

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
    }
}
