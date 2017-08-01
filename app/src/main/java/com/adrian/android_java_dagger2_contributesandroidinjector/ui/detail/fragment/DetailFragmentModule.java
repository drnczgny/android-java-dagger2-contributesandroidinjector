package com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail.fragment;

import com.adrian.android_java_dagger2_contributesandroidinjector.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cadri on 2017. 08. 01..
 */

@Module
public class DetailFragmentModule {

    @FragmentScope
    @Provides
    DetailFragmentView providesDetailFragmentView(DetailFragment detailFragment) {
        return detailFragment;
    }

    @FragmentScope
    @Provides
    DetailFragmentPresenter providesDetailFragmentPresenter(DetailFragmentView detailFragmentView) {
        return new DetailFragmentPresenter(detailFragmentView);
    }

}
