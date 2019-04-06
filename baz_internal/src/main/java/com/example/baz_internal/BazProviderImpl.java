package com.example.baz_internal;

import com.example.baz_public.BazComponent;
import com.example.baz_public.BazSingletonComponent;

public class BazProviderImpl {

    public static BazComponent getComponent(BazSingletonComponent bazSingletonComponent) {
        return DaggerBazComponentImpl.builder()
                .bazSingletonComponent(bazSingletonComponent)
                .build();
    }

    public static BazSingletonComponent getSingletonComponent() {
        return DaggerBazSingletonComponentImpl.create();
    }
}
