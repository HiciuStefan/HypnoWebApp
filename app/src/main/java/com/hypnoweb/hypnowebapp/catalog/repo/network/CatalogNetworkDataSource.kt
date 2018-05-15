package com.hypnoweb.hypnowebapp.catalog.repo.network


import android.content.Context
import com.google.gson.Gson
import com.hypnoweb.hypnowebapp.catalog.Catalog
import io.reactivex.Single
import java.io.InputStreamReader
import javax.inject.Inject

class CatalogNetworkDataSource @Inject constructor(private val catalogApi: CatalogApi,
                                                   private val catalogNetworkMapper: CatalogNetworkMapper,
                                                   context: Context) {

    val records: CatalogNetwork

    init {
        val gson = Gson()
        records = gson.fromJson(InputStreamReader(context.getAssets().open("records.txt"), Charsets.UTF_8), CatalogNetwork::class.java)
    }

    val catalog: Single<Catalog>
        get() = Single.just(records)
                .flatMap { catalogNetwork -> catalogNetworkMapper.fromNetworkCatalog(catalogNetwork) }
}