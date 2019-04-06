package com.example.baz_internal;

import android.util.Log;

import com.example.baz_public.BazSingleton;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class BazSingletonImpl implements BazSingleton {

    @Inject
    public BazSingletonImpl() {
        Log.d("testest", "BazSingletonImpl created: " + this);
    }

    @Override
    public void baz() {
        Log.d("daggertest", "baz: " + this);
    }
}
