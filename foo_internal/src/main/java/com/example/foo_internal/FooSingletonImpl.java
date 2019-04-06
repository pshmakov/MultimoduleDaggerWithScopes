package com.example.foo_internal;

import android.util.Log;

import com.example.baz_public.BazSingleton;
import com.example.foo_public.FooSingleton;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class FooSingletonImpl implements FooSingleton {

    @Inject
    public FooSingletonImpl(BazSingleton bazSingleton) {
        Log.d("daggertest", "FooSingletonImpl() called with: bazSingleton = [" + bazSingleton + "]");
    }

    @Override
    public void foo() {

    }
}
