package com.example.dagger2.dagger;


import com.example.dagger2.MainActivity;
import com.example.dagger2.car.Car;

import dagger.Component;
@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();
    void inject(MainActivity mainActivity);
}
