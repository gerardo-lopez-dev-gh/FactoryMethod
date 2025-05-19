package com.library.factoryMethod.models;

import com.library.factoryMethod.Vehicle;

public class Car implements Vehicle {


    @Override
    public void start() {
        System.out.println("---> Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("---> Car is stopping");
    }
}
