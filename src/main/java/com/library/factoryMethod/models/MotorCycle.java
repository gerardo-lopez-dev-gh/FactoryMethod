package com.library.factoryMethod.models;

import com.library.factoryMethod.Vehicle;

public class MotorCycle implements Vehicle {

    @Override
    public void start() {
        System.out.println("---> MotorCycle is starting");
    }

    @Override
    public void stop() {
        System.out.println("---> MotorCycle is stopping");
    }
}
