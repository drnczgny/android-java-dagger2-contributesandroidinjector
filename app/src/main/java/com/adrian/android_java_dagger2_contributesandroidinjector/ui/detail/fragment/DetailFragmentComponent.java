package com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail.fragment;

import com.adrian.android_java_dagger2_contributesandroidinjector.scope.FragmentScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by cadri on 2017. 08. 01..
 */

@FragmentScope
@Subcomponent(modules = DetailFragmentModule.class)
public interface DetailFragmentComponent extends AndroidInjector<DetailFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailFragment> {}
}
