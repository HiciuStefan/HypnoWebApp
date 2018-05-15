package com.hypnoweb.hypnowebapp.splashscreen

import android.content.Context
import android.content.Intent
import com.hypnoweb.hypnowebapp.ui.catalog.CatalogActivity
import com.hypnoweb.hypnowebapp.ui.splashscreen.SplashScreenActivity
import com.hypnoweb.hypnowebapp.ui.splashscreen.SplashScreenFragment
import javax.inject.Inject

class SplashScreenNavigator @Inject constructor(val context: SplashScreenFragment) {

    fun goToCatalog() {
        val intent = Intent(context.context, CatalogActivity::class.java)
        context.startActivity(intent)
    }
}