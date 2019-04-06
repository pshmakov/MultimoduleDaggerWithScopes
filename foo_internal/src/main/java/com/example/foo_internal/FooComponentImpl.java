package com.example.foo_internal;

import com.example.bar_public.BarComponent;
import com.example.baz_public.BazComponent;
import com.example.baz_public.BazSingletonComponent;
import com.example.common.ActivityScope;
import com.example.foo_public.FooComponent;
import com.example.foo_public.FooSingletonComponent;

import dagger.Component;

@ActivityScope
@Component(dependencies = {FooSingletonComponent.class,
        BarComponent.class, BazSingletonComponent.class})
public interface FooComponentImpl extends FooComponent {
    FooCoordinatorImpl resolveFooCoordinator();
}
