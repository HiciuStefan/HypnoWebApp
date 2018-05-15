package com.hypnoweb.hypnowebapp.ui.splashscreen

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hypnoweb.hypnowebapp.R
import com.hypnoweb.hypnowebapp.databinding.SplashscreenfragmentBinding
import com.hypnoweb.hypnowebapp.di.ViewModelFactory.ViewModelFactory
import com.hypnoweb.hypnowebapp.splashscreen.SplashViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class SplashScreenFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.splashscreenfragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val viewModel = ViewModelProviders.of(activity, viewModelFactory)
                .get(SplashViewModel::class.java)
        val binding = DataBindingUtil.bind<SplashscreenfragmentBinding>(view!!)
        binding!!.viewModel = viewModel
        viewModel.addSubscriptions()

    }

    companion object {
        fun getInstance(): SplashScreenFragment {
            val fragment = SplashScreenFragment()
            return fragment

        }
    }

}
