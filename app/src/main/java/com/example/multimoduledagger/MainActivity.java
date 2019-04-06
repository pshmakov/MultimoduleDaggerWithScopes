package com.example.multimoduledagger;

import android.app.Activity;
import android.os.Bundle;

import com.example.bar_public.BarComponent;
import com.example.bar_public.BarCoordinator;
import com.example.bar_public.BarProvider;
import com.example.baz_public.BazComponent;
import com.example.baz_public.BazCoordinator;
import com.example.baz_public.BazProvider;
import com.example.foo_public.FooComponent;
import com.example.foo_public.FooCoordinator;
import com.example.foo_public.FooProvider;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BazComponent bazComponent = BazProvider.getComponent(App.getBazSingletonComponent());
        BarComponent barComponent = BarProvider.getComponent(App.getBarSingletonComponent(),
                bazComponent, App.getBazSingletonComponent());
        FooComponent fooComponent = FooProvider.getComponent(
                App.getFooSingletonComponent(), barComponent, App.getBazSingletonComponent());

        FooCoordinator fooCoordinator = fooComponent.resolveFooCoordinator();
        fooCoordinator.foo();

        BarCoordinator barCoordinator = barComponent.resolveBarCoordinator();
        barCoordinator.bar();

        BazCoordinator bazCoordinator = bazComponent.resolveBazCoordinator();
        bazCoordinator.baz();
    }
}
