package com.example.bar_internal;


import com.example.bar_public.BarComponent;
import com.example.bar_public.BarCoordinator;
import com.example.bar_public.BarSingletonComponent;
import com.example.baz_public.BazComponent;
import com.example.baz_public.BazSingletonComponent;

// Bar doesn't use Dagger, so this is a "manual" implementation of the component
public class BarComponentImpl implements BarComponent {

    private final BarSingletonComponent mBarSingletonComponent;
    private final BazComponent mBazComponent;
    private final BazSingletonComponent mBazSingletonComponent;

    public BarComponentImpl(BarSingletonComponent barSingletonComponent,
                            BazComponent bazComponent,
                            BazSingletonComponent bazSingletonComponent) {
        mBarSingletonComponent = barSingletonComponent;
        mBazComponent = bazComponent;
        mBazSingletonComponent = bazSingletonComponent;
    }

    @Override
    public BarCoordinator resolveBarCoordinator() {
        return new BarCoordinatorImpl(new BarDependency(),
                mBarSingletonComponent.resolveBarSingleton(),
                mBazComponent.resolveBazCoordinator(),
                mBazSingletonComponent.resolveBazSingleton());
    }
}
