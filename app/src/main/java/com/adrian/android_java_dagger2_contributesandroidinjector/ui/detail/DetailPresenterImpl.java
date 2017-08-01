package com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail;

import com.adrian.android_java_dagger2_contributesandroidinjector.data.ApiService;

import javax.inject.Inject;


/**
 * Created by mertsimsek on 30/05/2017.
 */

public class DetailPresenterImpl implements DetailPresenter{

    DetailView detailView;
    ApiService apiService;

    @Inject
    public DetailPresenterImpl(DetailView detailView, ApiService apiService) {
        this.detailView = detailView;
        this.apiService = apiService;
    }

    public void loadDetail(){
        apiService.loadData();
        detailView.onDetailLoaded();
    }
}
