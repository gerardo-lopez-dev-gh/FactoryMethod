package com.library.normalFactory.models;

import com.library.normalFactory.Vehicle;

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
