package com.hypnoweb.hypnowebapp.catalog.repo.network

import io.reactivex.Single
import retrofit2.http.GET


interface CatalogApi {
    @get:GET("api/series/read.php")
    val catalog: Single<CatalogNetwork>

    /*
    types
    https://www.hypnoweb.net/api/series_category/read.php
    details
    https://www.hypnoweb.net/api/series/read_one.php?id=1
    */

}
