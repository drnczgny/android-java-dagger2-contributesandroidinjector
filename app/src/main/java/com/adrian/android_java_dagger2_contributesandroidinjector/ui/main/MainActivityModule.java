package com.adrian.android_java_dagger2_contributesandroidinjector.ui.main;

import com.adrian.android_java_dagger2_contributesandroidinjector.data.ApiService;
import com.adrian.android_java_dagger2_contributesandroidinjector.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cadri on 2017. 08. 01..
 */

@Module
public class MainActivityModule {

    @ActivityScope
    @Provides
    MainView providesMainView(MainActivity mainActivity) {
        return mainActivity;
    }

    @ActivityScope
    @Provides
    MainPresenter providesMainPresenter(MainView mainView, ApiService apiService) {
        return new MainPresenterImpl(mainView, apiService);
    }

}
