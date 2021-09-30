package com.example.zddaggerhilt.di;

import com.example.zddaggerhilt.scopes.ActScope;

import javax.inject.Inject;

@ActScope
public class Address {
    @Inject
    public Address(){}
}
