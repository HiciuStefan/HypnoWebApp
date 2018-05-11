package com.hypnoweb.hypnowebapp.networking

import com.hypnoweb.hypnowebapp.BuildConfig
import com.hypnoweb.hypnowebapp.catalog.repo.network.CatalogApi
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject


class NetworkFactory @Inject constructor() {

    private val retrofitBuilder: Retrofit
    private val httpClient: OkHttpClient

    val catalogApi: CatalogApi
        get() = retrofitBuilder.create(CatalogApi::class.java)

    init {
        httpClient = OkHttpClient.Builder()
                .addInterceptor { chain ->
                    val response = chain.proceed(chain.request())
                    //to help debug because of some problems with the certificates , no proxy for now
                    var i = 0
                    i++
                    response
                }
                .build()
        retrofitBuilder = Retrofit.Builder()
                .baseUrl(BuildConfig.SERVER_URL)
                .client(httpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

}
