package com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail;


import com.adrian.android_java_dagger2_contributesandroidinjector.scope.ActivityScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by cadri on 2017. 08. 01..
 */

@ActivityScope
@Subcomponent(modules = {DetailActivityModule.class, DetailsFragmentProviderModule.class})
public interface DetailActivityComponent extends AndroidInjector<DetailActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailActivity>{}

}
