package com.library.factoryMethod.models;

import com.library.factoryMethod.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("---> Truck is starting");
    }

    @Override
    public void stop() {
        System.out.println("---> Truck is stopping");
    }
}
