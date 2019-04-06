package com.example.multimoduledagger;

import android.app.Application;

import com.example.bar_public.BarProvider;
import com.example.bar_public.BarSingletonComponent;
import com.example.baz_public.BazProvider;
import com.example.baz_public.BazSingletonComponent;
import com.example.foo_public.FooProvider;
import com.example.foo_public.FooSingletonComponent;

public class App extends Application {
    private static FooSingletonComponent sFooSingletonComponent;
    private static BarSingletonComponent sBarSingletonComponent;
    private static BazSingletonComponent sBazSingletonComponent;


    public static FooSingletonComponent getFooSingletonComponent() {
        if (sFooSingletonComponent == null) {
            sFooSingletonComponent = FooProvider.getSingletonComponent(getBazSingletonComponent());
        }
        return sFooSingletonComponent;
    }

    public static BarSingletonComponent getBarSingletonComponent() {
        if (sBarSingletonComponent == null) {
            sBarSingletonComponent = BarProvider.getSingletonComponent(getBazSingletonComponent());
        }
        return sBarSingletonComponent;
    }

    public static BazSingletonComponent getBazSingletonComponent() {
        if (sBazSingletonComponent == null) {
            sBazSingletonComponent = BazProvider.getSingletonComponent();
        }
        return sBazSingletonComponent;
    }
}
