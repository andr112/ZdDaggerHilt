package com.example.zddaggerhilt.api;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ZdDataRepository {
    ZdRetrofitService service;

    @Inject
    public ZdDataRepository(ZdRetrofitService service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "service=" + service +
                '}';
    }
}
