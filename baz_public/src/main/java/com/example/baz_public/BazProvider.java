package com.example.baz_public;

public class BazProvider {

    public static BazComponent getComponent(BazSingletonComponent bazSingletonComponent) {
        try {
            return (BazComponent) Class.forName("com.example.baz_internal.BazProviderImpl")
                    .getMethod("getComponent", BazSingletonComponent.class)
                    .invoke(null, bazSingletonComponent);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static BazSingletonComponent getSingletonComponent() {
        try {
            return (BazSingletonComponent) Class.forName("com.example.baz_internal.BazProviderImpl")
                    .getMethod("getSingletonComponent").invoke(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
