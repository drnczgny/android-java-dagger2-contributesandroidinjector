package com.adrian.android_java_dagger2_contributesandroidinjector.di;

import android.app.Application;
import android.content.Context;

import com.adrian.android_java_dagger2_contributesandroidinjector.data.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cadri on 2017. 08. 01..
 */

@Module
public class AppModule {

    @Singleton
    @Provides
    Context providesContext(Application application) {
        return application;
    }

    @Singleton
    @Provides
    ApiService providesApiService() {
        return new ApiService();
    }

}
