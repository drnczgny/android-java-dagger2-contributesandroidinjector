package com.adrian.android_java_dagger2_contributesandroidinjector.di;

import android.app.Application;

import com.adrian.android_java_dagger2_contributesandroidinjector.MyApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by cadri on 2017. 08. 01..
 */

@Singleton
@Component(modules = {ActivityBuilder.class, AppModule.class, AndroidInjectionModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(MyApplication myApplication);
}
