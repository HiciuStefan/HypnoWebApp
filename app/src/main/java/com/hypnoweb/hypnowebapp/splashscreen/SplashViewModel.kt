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

    val bag: CompositeDisposable
    var loading = ObservableBoolean()

    init {
        bag = CompositeDisposable()
        loading.set(true)
    }

    fun addSubscriptions() {
        bag.add(catalogRepository.catalog
                .subscribeOn(Schedulers.io())
                .subscribe(
                        { catalog ->
                            loading.set(false)
                            catalog.movies

                        },
                        { throwable -> Timber.e(throwable) }
                )
        )
    }

    override fun onCleared() {
        super.onCleared()
        bag.dispose()
    }
}
