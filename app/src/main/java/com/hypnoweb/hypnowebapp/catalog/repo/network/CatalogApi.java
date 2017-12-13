package com.hypnoweb.hypnowebapp.catalog.repo.network;


import io.reactivex.Single;
import retrofit2.http.GET;

public interface CatalogApi {

    @GET("api/series/read.php")
    Single<CatalogNetwork> getCatalog();
}
