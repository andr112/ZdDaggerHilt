package com.example.zddaggerhilt;

import android.app.Application;

import com.example.zddaggerhilt.di.AppComponent;
import com.example.zddaggerhilt.di.DaggerAppComponent;

public class ZdApp extends Application {
    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }
}
