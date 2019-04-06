package com.example.bar_internal;

import android.util.Log;

import com.example.bar_public.BarSingleton;
import com.example.baz_public.BazSingleton;

public class BarSingletonImpl implements BarSingleton {

    public BarSingletonImpl(BazSingleton bazSingleton) {
        Log.d("daggertest", "BarSingletonImpl() called with: bazSingleton = [" + bazSingleton + "]");
    }

    @Override
    public void bar() {
        Log.d("daggertest", "bar: " + this);
    }
}
