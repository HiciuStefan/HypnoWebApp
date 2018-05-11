package com.hypnoweb.hypnowebapp.catalog.repo.network

import com.google.gson.annotations.SerializedName
import java.util.*


class CatalogNetwork internal constructor(@SerializedName("records") val movies: ArrayList<MovieNetwork>? = null) {

    data class MovieNetwork constructor(@SerializedName("id") val movieId: String? = null,
                                        @SerializedName("title_vo") val shortTitle: String? = null,
                                        @SerializedName("title_vf") val biggerTitle: String? = null,
                                        @SerializedName("category_id") val movieTypeId: String? = null,
                                        @SerializedName("banner_url") val banner: String? = null)
}
