package com.hypnoweb.hypnowebapp.uibinders

import android.databinding.BindingAdapter
import android.support.v4.widget.ContentLoadingProgressBar


@BindingAdapter("loading")
fun setLoadingContentLoadingProgressBar(contentLoadingProgressBar: ContentLoadingProgressBar?, loading: Boolean?) {
    if (contentLoadingProgressBar != null) {
        contentLoadingProgressBar.show()
        contentLoadingProgressBar.isIndeterminate = true
    }
}

@BindingAdapter("loading2")
fun setLoadingContentLoadingProgressBar2(contentLoadingProgressBar: ContentLoadingProgressBar?, loading: Boolean?) {
    if (contentLoadingProgressBar != null) {
        contentLoadingProgressBar.show()
        contentLoadingProgressBar.isIndeterminate = true
    }
}
