package com.example.zddaggerhilt.di;

import com.example.zddaggerhilt.api.ZdRetrofitService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.HiltAndroidApp;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {
    @Singleton
    @Provides
    ZdRetrofitService provideZdRetrofitService() {
        return ZdRetrofitService.create();
    }

}
