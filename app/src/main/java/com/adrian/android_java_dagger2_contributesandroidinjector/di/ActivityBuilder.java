package com.adrian.android_java_dagger2_contributesandroidinjector.di;

import android.app.Activity;

import com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail.DetailActivity;
import com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail.DetailActivityComponent;
import com.adrian.android_java_dagger2_contributesandroidinjector.ui.main.MainActivity;
import com.adrian.android_java_dagger2_contributesandroidinjector.ui.main.MainActivityComponent;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by cadri on 2017. 08. 01..
 */

@Module
public abstract class ActivityBuilder {

    @Singleton
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);

    @Singleton
    @Binds
    @IntoMap
    @ActivityKey(DetailActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindDetailActivity(DetailActivityComponent.Builder builder);

}
