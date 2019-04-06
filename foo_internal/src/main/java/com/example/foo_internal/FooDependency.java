package com.example.foo_internal;

import com.example.common.ActivityScope;

import javax.inject.Inject;

@ActivityScope
public class FooDependency {
    @Inject
    public FooDependency() {}
}
