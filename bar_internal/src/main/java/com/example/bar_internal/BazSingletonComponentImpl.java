package com.example.bar_internal;

import com.example.bar_public.BarSingleton;
import com.example.bar_public.BarSingletonComponent;
import com.example.baz_public.BazSingleton;
import com.example.baz_public.BazSingletonComponent;

public class BazSingletonComponentImpl implements BarSingletonComponent {
    private final BazSingletonComponent mBazSingletonComponent;

    private BarSingleton mBazSingleton;

    public BazSingletonComponentImpl(BazSingletonComponent bazSingletonComponent) {
        mBazSingletonComponent = bazSingletonComponent;
    }

    @Override
    public BarSingleton resolveBarSingleton() {
        if (mBazSingleton == null) {
            mBazSingleton = new BarSingletonImpl(mBazSingletonComponent.resolveBazSingleton());
        }
        return mBazSingleton;
    }
}
