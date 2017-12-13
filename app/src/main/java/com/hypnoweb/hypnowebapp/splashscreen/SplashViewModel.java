package com.hypnoweb.hypnowebapp.splashscreen;

import android.databinding.ObservableBoolean;

import com.hypnoweb.hypnowebapp.catalog.repo.CatalogRepository;
import com.hypnoweb.hypnowebapp.viewmodel.ViewModelBase;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import timber.log.Timber;


public class SplashViewModel extends ViewModelBase {

    public ObservableBoolean loading = new ObservableBoolean();
    private CatalogRepository catalogRepository;


    @Inject
    public SplashViewModel(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
        loading.set(true);
    }


    @Override
    public void addSubscriptions(CompositeDisposable compositeDisposable) {
        catalogRepository.getCatalog()
                .subscribeOn(Schedulers.io())
                .subscribe(catalog -> loading.set(false),
                        throwable -> Timber.e(throwable));

    }
}
