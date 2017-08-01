package com.adrian.android_java_dagger2_contributesandroidinjector.ui.main;

import com.adrian.android_java_dagger2_contributesandroidinjector.data.ApiService;

import javax.inject.Inject;


/**
 * Created by mertsimsek on 25/05/2017.
 */

public class MainPresenterImpl implements MainPresenter{
    MainView mainView;
    ApiService apiService;

    @Inject
    public MainPresenterImpl(MainView mainView, ApiService apiService) {
        this.mainView = mainView;
        this.apiService = apiService;
    }

    public void loadMain(){
        apiService.loadData();
        mainView.onMainLoaded();
    }
}
