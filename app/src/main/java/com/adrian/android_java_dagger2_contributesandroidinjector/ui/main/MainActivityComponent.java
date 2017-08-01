package com.adrian.android_java_dagger2_contributesandroidinjector.ui.main;

import com.adrian.android_java_dagger2_contributesandroidinjector.scope.ActivityScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by cadri on 2017. 08. 01..
 */

@ActivityScope
@Subcomponent(modules = {MainActivityModule.class})
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}

}
