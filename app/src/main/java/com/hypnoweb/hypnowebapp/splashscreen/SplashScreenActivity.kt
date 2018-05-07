package com.hypnoweb.hypnowebapp.splashscreen

import android.os.Bundle
import com.hypnoweb.hypnowebapp.R
import dagger.android.support.DaggerAppCompatActivity

class SplashScreenActivity : DaggerAppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.supportFragmentManager.beginTransaction().replace(R.id.container, SplashScreenFragment.getInstance()).commit()

    }
}
