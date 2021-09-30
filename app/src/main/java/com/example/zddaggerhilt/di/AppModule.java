package com.example.zddaggerhilt.di;

import com.example.zddaggerhilt.api.ZdDataRepository;
import com.example.zddaggerhilt.api.ZdRetrofitService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Singleton
    @Provides
    ZdRetrofitService provideZdRetrofitService() {
        return ZdRetrofitService.create();
    }

}
