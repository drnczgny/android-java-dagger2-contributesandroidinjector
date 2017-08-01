package com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail;

import android.support.v4.app.Fragment;

import com.adrian.android_java_dagger2_contributesandroidinjector.scope.ActivityScope;
import com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail.fragment.DetailFragment;
import com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail.fragment.DetailFragmentComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by cadri on 2017. 08. 01..
 */

@Module
public abstract class DetailsFragmentProviderModule {

    @ActivityScope
    @Binds
    @IntoMap
    @FragmentKey(DetailFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> provideDetailFragmentFactory(DetailFragmentComponent.Builder builder);

}
