package com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail.fragment;

/**
 * Created by mertsimsek on 02/06/2017.
 */

public class DetailFragmentPresenter {

    DetailFragmentView detailFragmentView;

    public DetailFragmentPresenter(DetailFragmentView detailFragmentView) {
        this.detailFragmentView = detailFragmentView;
        detailFragmentView.onDetailFragmentLoaded();
    }
}
