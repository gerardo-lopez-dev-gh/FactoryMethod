package com.library.factoryMethod;

import com.library.factoryMethod.factory.CarFactory;
import com.library.factoryMethod.factory.MotorCycleFactory;
import com.library.factoryMethod.factory.PlaneFactory;
import com.library.factoryMethod.factory.TruckFactory;

public class Main2 {
    public static void main(String[] args) {
        Vehicle car = new CarFactory().createVehicle();
        Vehicle plane = new PlaneFactory().createVehicle();
        Vehicle motorCycle = new MotorCycleFactory().createVehicle();
        Vehicle truck = new TruckFactory().createVehicle();
        car.start();
        plane.start();
        motorCycle.start();
        truck.start();
        car.stop();
        plane.stop();
        motorCycle.stop();
        truck.stop();
    }
}
