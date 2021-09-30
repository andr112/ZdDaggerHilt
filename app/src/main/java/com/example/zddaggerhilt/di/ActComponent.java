package com.example.zddaggerhilt.di;

import com.example.zddaggerhilt.MainActivity;
import com.example.zddaggerhilt.SettingActivity;
import com.example.zddaggerhilt.scopes.ActScope;

import dagger.Subcomponent;

@ActScope
@Subcomponent(modules = ActModule.class)
public interface ActComponent {
    @Subcomponent.Factory
    interface Factory {
        ActComponent create();
    }

    void inject(MainActivity mainActivity);

    void inject(SettingActivity settingActivity);
}
