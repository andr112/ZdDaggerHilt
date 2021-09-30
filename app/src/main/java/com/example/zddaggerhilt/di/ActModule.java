package com.example.zddaggerhilt.di;

import com.example.zddaggerhilt.scopes.ActScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ActModule {

    @ActScope
    @Provides
    User provideUser() {
        return new User();
    }

}
