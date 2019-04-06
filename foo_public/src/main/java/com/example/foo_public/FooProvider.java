package com.example.foo_public;

import com.example.bar_public.BarComponent;
import com.example.baz_public.BazSingletonComponent;

public class FooProvider {

    public static FooComponent getComponent(FooSingletonComponent fooSingletonComponent,
                                            BarComponent barComponent,
                                            BazSingletonComponent bazSingletonComponent) {
        // With jar exclusion trick this would just return null.

        // But do we even need this (reflection or jar exclusion)?
        // The top-level build target needs to depend on all the "internal" modules anyway, so
        // why not use FooFactoryImpl directly?

        try {
            return (FooComponent) Class.forName("com.example.foo_internal.FooProviderImpl")
                    .getMethod("getComponent", FooSingletonComponent.class,
                            BarComponent.class, BazSingletonComponent.class)
                    .invoke(null, fooSingletonComponent, barComponent, bazSingletonComponent);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static FooSingletonComponent getSingletonComponent(
            BazSingletonComponent bazSingletonComponent) {
        try {
            return (FooSingletonComponent) Class.forName("com.example.foo_internal.FooProviderImpl")
                    .getMethod("getSingletonComponent", BazSingletonComponent.class)
                    .invoke(null, bazSingletonComponent);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
