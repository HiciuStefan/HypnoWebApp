package com.hypnoweb.hypnowebapp.catalog.repo.network

import io.reactivex.Single
import retrofit2.http.GET


interface CatalogApi {
    @get:GET("api/series/read.php")
    val catalog: Single<CatalogNetwork>
}
