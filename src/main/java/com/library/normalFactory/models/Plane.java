package com.library.normalFactory.models;

import com.library.normalFactory.Vehicle;

public class Plane implements Vehicle {
    @Override
    public void start() {
        System.out.println("---> Plane is starting");
    }

    @Override
    public void stop() {
        System.out.println("---> Plane is stopping");
    }

    public void fly() {
        System.out.println("---> Plane is flying");
    }
}
