package com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail;

import com.adrian.android_java_dagger2_contributesandroidinjector.scope.FragmentScope;
import com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail.fragment.DetailFragment;
import com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail.fragment.DetailFragmentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by cadri on 2017. 08. 01..
 */

@Module
public abstract class DetailsFragmentProviderModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = {DetailFragmentModule.class})
    abstract DetailFragment bindDetailFragment();

}
