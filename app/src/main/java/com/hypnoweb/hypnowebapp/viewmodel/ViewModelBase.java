package com.hypnoweb.hypnowebapp.viewmodel;

import android.arch.lifecycle.ViewModel;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by stefan on 12/13/2017.
 */

public abstract class ViewModelBase extends ViewModel implements ViewmodelLifeCycle {

    CompositeDisposable compositeDisposable = new CompositeDisposable();

    public ViewModelBase() {
    }

    public void onStart() {
        if (!compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
        compositeDisposable = new CompositeDisposable();
        addSubscriptions(compositeDisposable);
    }

    public void onStop() {
        compositeDisposable.dispose();
    }

    public abstract void addSubscriptions(CompositeDisposable compositeDisposable);

}
