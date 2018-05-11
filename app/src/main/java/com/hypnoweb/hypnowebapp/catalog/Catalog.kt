package com.hypnoweb.hypnowebapp.catalog

class Catalog(val movies: List<Movie>) {
    data class Movie(val movieId: String?, val shortTitle: String?, val biggerTitle: String?, val movieTypeId: String?, val banner: String?)
}
