package com.example.zddaggerhilt.di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, ActSubModule.class})
public interface AppComponent {
    ActComponent.Factory actFactory();
}
