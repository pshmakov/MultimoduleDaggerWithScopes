package com.example.bar_internal;

import android.util.Log;

import com.example.bar_public.BarCoordinator;
import com.example.bar_public.BarSingleton;
import com.example.baz_public.BazCoordinator;
import com.example.baz_public.BazSingleton;


public class BarCoordinatorImpl implements BarCoordinator {

    private final BazCoordinator mBazCoordinator;

    public BarCoordinatorImpl(BarDependency barDependency,
                              BarSingleton barSingleton,
                              BazCoordinator bazCoordinator,
                              BazSingleton bazSingleton) {
        Log.d("daggertest", "BarCoordinatorImpl() called with: barDependency = [" + barDependency + "], barSingleton = [" + barSingleton + "], bazCoordinator = [" + bazCoordinator + "], bazSingleton = [" + bazSingleton + "]");
        mBazCoordinator = bazCoordinator;
    }

    @Override
    public void bar() {
        Log.d("daggertest", "bar: " + this);
        mBazCoordinator.baz();
    }
}
