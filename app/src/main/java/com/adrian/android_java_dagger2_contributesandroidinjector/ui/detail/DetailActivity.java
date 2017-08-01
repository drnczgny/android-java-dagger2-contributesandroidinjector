package com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.adrian.android_java_dagger2_contributesandroidinjector.R;
import com.adrian.android_java_dagger2_contributesandroidinjector.ui.detail.fragment.DetailFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * Created by mertsimsek on 25/05/2017.
 */

public class DetailActivity extends AppCompatActivity implements DetailView, HasSupportFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;

    @Inject
    DetailPresenter detailPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailPresenter.loadDetail();

        if (savedInstanceState == null)
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, DetailFragment.newInstance())
                    .commitAllowingStateLoss();
    }

    @Override
    public void onDetailLoaded() {
        Log.i("TEST", "Detail is loaded");
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }
}
