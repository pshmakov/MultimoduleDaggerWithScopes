package com.example.baz_internal;

import com.example.baz_public.BazComponent;
import com.example.baz_public.BazSingletonComponent;
import com.example.common.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(dependencies = {BazSingletonComponent.class})
public interface BazComponentImpl extends BazComponent {
    BazCoordinatorImpl resolveBazCoordinator();
}
