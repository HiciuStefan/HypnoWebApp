package com.hypnoweb.hypnowebapp.database.movie

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity
class MovieDb {

    @PrimaryKey
    var idPrimary: Int = 0

    @ColumnInfo(name = "movieId")
    var movieId: String? = null

    @ColumnInfo(name = "shortTitle")
    var shortTitle: String? = null

    @ColumnInfo(name = "biggerTitle")
    var biggerTitle: String? = null

    @ColumnInfo(name = "movieTypeId")
    var movieTypeId: String? = null

    @ColumnInfo(name = "banner")
    var banner: String? = null
}
