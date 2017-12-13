package com.hypnoweb.hypnowebapp.catalog.repo;

import java.util.List;

/**
 * Created by stefan on 12/13/2017.
 */

public class Catalog {
    private final List<Movie> movies;

    public Catalog(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public static class Movie {
        private String movieId;
        private String shortTitle;
        private String biggerTitle;
        private String movieTypeId;
        private String banner;

        public Movie(String movieId, String shortTitle, String biggerTitle, String movieTypeId, String banner) {
            this.movieId = movieId;
            this.shortTitle = shortTitle;
            this.biggerTitle = biggerTitle;
            this.movieTypeId = movieTypeId;
            this.banner = banner;
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
    }
}
