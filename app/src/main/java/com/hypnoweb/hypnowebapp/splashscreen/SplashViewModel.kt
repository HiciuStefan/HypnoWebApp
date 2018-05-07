package com.hypnoweb.hypnowebapp.splashscreen

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean
import com.hypnoweb.hypnowebapp.catalog.repo.CatalogRepository
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber
import javax.inject.Inject

class SplashViewModel @Inject constructor(private val catalogRepository: CatalogRepository,
                                          private val navigator: Navigator) : ViewModel() {

    var loading = ObservableBoolean()


    init {
        loading.set(true)
    }


    fun addSubscriptions(compositeDisposable: CompositeDisposable) {
        catalogRepository.getCatalog()
                .subscribeOn(Schedulers.io())
                .subscribe(
                        { loading.set(false) },
                        { throwable -> Timber.e(throwable) })
    }

    override fun onCleared() {
        super.onCleared()
    }
}
