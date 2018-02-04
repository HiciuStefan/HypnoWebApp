package com.hypnoweb.hypnowebapp.splashscreen;


import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hypnoweb.hypnowebapp.R;
import com.hypnoweb.hypnowebapp.databinding.SplashscreenfragmentBinding;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;


public class SplashScreenFragment extends DaggerFragment {

    @Inject
    ViewModelProvider.Factory viewModelFactory;


    public static SplashScreenFragment getInstance() {
        return new SplashScreenFragment();
    }

    public SplashScreenFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.splashscreenfragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final SplashViewModel viewModel = ViewModelProviders.of(getActivity(), viewModelFactory)
                .get(SplashViewModel.class);
        SplashscreenfragmentBinding binding = DataBindingUtil.bind(getView());
        binding.setViewModel(viewModel);

    }

}
