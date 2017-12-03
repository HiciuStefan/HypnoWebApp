package com.hypnoweb.hypnowebapp.uibinders;

import android.databinding.BindingAdapter;
import android.support.v4.widget.ContentLoadingProgressBar;

/**
 * Created by stefan on 12/3/2017.
 */

public class SplashScreenBindingAdapter {


    @BindingAdapter("loading")
    public static void setLoadingContentLoadingProgressBar(ContentLoadingProgressBar contentLoadingProgressBar, Boolean loading) {
        if (contentLoadingProgressBar != null) {
            contentLoadingProgressBar.show();
            contentLoadingProgressBar.setIndeterminate(true);
        }

    }
}
