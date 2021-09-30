package com.example.zddaggerhilt.di;

import javax.inject.Inject;

import dagger.hilt.android.scopes.ActivityScoped;

@ActivityScoped
public class Address {
    @Inject
    public Address(){}
}
