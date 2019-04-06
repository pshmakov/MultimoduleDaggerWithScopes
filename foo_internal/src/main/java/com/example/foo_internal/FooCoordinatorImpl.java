package com.example.foo_internal;

import android.util.Log;

import com.example.bar_public.BarCoordinator;
import com.example.baz_public.BazSingleton;
import com.example.common.ActivityScope;
import com.example.foo_public.FooCoordinator;
import com.example.foo_public.FooSingleton;

import javax.inject.Inject;

@ActivityScope
public class FooCoordinatorImpl implements FooCoordinator {

    @Inject
    public FooCoordinatorImpl(FooDependency fooDependency,
                              FooSingleton fooSingleton,
                              BarCoordinator barCoordinator,
                              BazSingleton bazSingleton) {
        Log.d("daggertest", "FooCoordinatorImpl() called with: fooDependency = [" + fooDependency + "], fooSingleton = [" + fooSingleton + "], barCoordinator = [" + barCoordinator + "], bazSingleton = [" + bazSingleton + "]");
    }

    @Override
    public void foo() {
        Log.d("daggertest", "foo: " + this);
    }
}
