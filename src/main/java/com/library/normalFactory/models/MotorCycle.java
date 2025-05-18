package com.library.normalFactory.models;

import com.library.normalFactory.Vehicle;

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
