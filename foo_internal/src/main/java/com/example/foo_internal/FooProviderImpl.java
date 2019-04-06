package com.example.foo_internal;

import com.example.bar_public.BarComponent;
import com.example.baz_public.BazSingletonComponent;
import com.example.foo_public.FooComponent;
import com.example.foo_public.FooSingletonComponent;

public class FooProviderImpl {
    public static FooComponent getComponent(FooSingletonComponent fooSingletonComponent,
                                            BarComponent barComponent,
                                            BazSingletonComponent bazSingletonComponent) {
        return DaggerFooComponentImpl.builder()
                .fooSingletonComponent(fooSingletonComponent)
                .barComponent(barComponent)
                .bazSingletonComponent(bazSingletonComponent)
                .build();
    }

    public static FooSingletonComponent getSingletonComponent(
                                            BazSingletonComponent bazSingletonComponent) {
        return DaggerFooSingletonComponentImpl.builder()
                .bazSingletonComponent(bazSingletonComponent)
                .build();
    }
}
