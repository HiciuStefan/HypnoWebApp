package com.hypnoweb.hypnowebapp.splashscreen;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.databinding.ObservableBoolean;
import android.widget.Toast;

import com.hypnoweb.hypnowebapp.catalog.repo.CatalogRepository;

import javax.inject.Inject;

import io.reactivex.annotations.NonNull;


public class SplashViewModel extends AndroidViewModel {

    public ObservableBoolean loading = new ObservableBoolean();
    private CatalogRepository catalogRepository;


    @Inject
    public SplashViewModel(CatalogRepository catalogRepository, @NonNull Application application) {
        super(application);
        this.catalogRepository = catalogRepository;
        loading.set(true);
        Toast.makeText(application, "Created View", Toast.LENGTH_SHORT).show();
    }



    /*public void addSubscriptions(CompositeDisposable compositeDisposable) {
        catalogRepository.getCatalog()
                .subscribeOn(Schedulers.io())
                .subscribe(catalog -> loading.set(false),
                        throwable -> Timber.e(throwable));

    }*/
}
