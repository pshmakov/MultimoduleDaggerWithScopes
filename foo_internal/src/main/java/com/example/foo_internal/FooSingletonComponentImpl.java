package com.example.foo_internal;

import com.example.baz_public.BazSingletonComponent;
import com.example.foo_public.FooSingletonComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(dependencies = {BazSingletonComponent.class})
public interface FooSingletonComponentImpl extends FooSingletonComponent {
    FooSingletonImpl resolveFooSingleton();
}
