package com.adrian.android_java_dagger2_contributesandroidinjector.di;

import com.adrian.android_java_dagger2_contributesandroidinjector.scope.ActivityScope;
import com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail.DetailActivity;
import com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail.DetailActivityModule;
import com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail.DetailsFragmentProviderModule;
import com.adrian.android_java_dagger2_contributesandroidinjector.ui.main.MainActivity;
import com.adrian.android_java_dagger2_contributesandroidinjector.ui.main.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by cadri on 2017. 08. 01..
 */

@Module
public abstract class ActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = {DetailActivityModule.class, DetailsFragmentProviderModule.class})
    abstract DetailActivity bindDeatilActivity();

}
