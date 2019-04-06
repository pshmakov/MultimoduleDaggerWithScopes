package com.example.bar_public;

import com.example.baz_public.BazComponent;
import com.example.baz_public.BazSingletonComponent;

public class BarProvider {

    public static BarComponent getComponent(BarSingletonComponent barSingletonComponent,
                                            BazComponent bazComponent,
                                            BazSingletonComponent bazSingletonComponent) {
        try {
            return (BarComponent) Class.forName("com.example.bar_internal.BarProviderImpl")
                    .getMethod("getComponent", BarSingletonComponent.class,
                            BazComponent.class, BazSingletonComponent.class)
                    .invoke(null, barSingletonComponent, bazComponent, bazSingletonComponent);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static BarSingletonComponent getSingletonComponent(
                                                     BazSingletonComponent bazSingletonComponent) {
        try {
            return (BarSingletonComponent) Class.forName("com.example.bar_internal.BarProviderImpl")
                    .getMethod("getSingletonComponent", BazSingletonComponent.class)
                    .invoke(null, bazSingletonComponent);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
