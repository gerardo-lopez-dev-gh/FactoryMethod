package com.library.normalFactory;

import com.library.normalFactory.factory.VehicleFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.createVehicle("car");
        Vehicle truck = vehicleFactory.createVehicle("truck");
        Vehicle plane = vehicleFactory.createVehicle("plane");
        Vehicle motorcycle = vehicleFactory.createVehicle("motorcycle");

        car.start();
        truck.start();
        plane.start();
        motorcycle.start();

        car.stop();
        truck.stop();
        plane.stop();
        motorcycle.stop();
    }
}