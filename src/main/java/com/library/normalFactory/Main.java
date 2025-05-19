package com.library.normalFactory;

import com.library.normalFactory.factory.VehicleFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a VehicleFactory instance

        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.createVehicle(TypeOfVehicle.CAR.name());
        Vehicle truck = vehicleFactory.createVehicle(TypeOfVehicle.TRUCK.name());
        Vehicle plane = vehicleFactory.createVehicle(TypeOfVehicle.PLANE.name());
        Vehicle motorcycle = vehicleFactory.createVehicle(TypeOfVehicle.MOTORCYCLE.name());

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