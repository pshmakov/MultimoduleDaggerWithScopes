package com.example.bar_internal;

import com.example.bar_public.BarComponent;
import com.example.bar_public.BarProvider;
import com.example.bar_public.BarSingletonComponent;
import com.example.baz_public.BazComponent;
import com.example.baz_public.BazSingletonComponent;

public class BarProviderImpl extends BarProvider {

    public static BarComponent getComponent(BarSingletonComponent barSingletonComponent,
                                            BazComponent bazComponent,
                                            BazSingletonComponent bazSingletonComponent) {
        return new BarComponentImpl(barSingletonComponent, bazComponent, bazSingletonComponent);
    }

    public static BarSingletonComponent getSingletonComponent(
            BazSingletonComponent bazSingletonComponent) {
        return new BazSingletonComponentImpl(bazSingletonComponent);
    }
}
