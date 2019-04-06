package com.example.baz_internal;

import android.util.Log;

import com.example.baz_public.BazCoordinator;
import com.example.baz_public.BazSingleton;
import com.example.common.ActivityScope;

import javax.inject.Inject;

@ActivityScope
public class BazCoordinatorImpl implements BazCoordinator {

    @Inject
    public BazCoordinatorImpl(BazSingleton bazSingleton, BazDependency bazDependency) {
        Log.d("daggertest", "BazCoordinatorImpl() called with: bazSingleton = [" + bazSingleton + "], bazDependency = [" + bazDependency + "]");
    }

    @Override
    public void baz() {
        Log.d("daggertest", "baz: " + this);
    }
}
