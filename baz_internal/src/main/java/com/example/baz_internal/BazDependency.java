package com.example.baz_internal;

import com.example.common.ActivityScope;

import javax.inject.Inject;

@ActivityScope
public class BazDependency {
    @Inject
    public BazDependency() {}
}
