package com.example.baz_internal;

import com.example.baz_public.BazSingletonComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component
public interface BazSingletonComponentImpl extends BazSingletonComponent {
    BazSingletonImpl resolveBazSingleton();
}
