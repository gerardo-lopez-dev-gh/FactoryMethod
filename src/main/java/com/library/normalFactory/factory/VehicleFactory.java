package com.library.normalFactory.factory;

import com.library.normalFactory.Vehicle;
import com.library.normalFactory.models.Car;
import com.library.normalFactory.models.MotorCycle;
import com.library.normalFactory.models.Plane;
import com.library.normalFactory.models.Truck;

public class VehicleFactory {

    public Vehicle createVehicle(String typeOfVehicle) {
        Vehicle vehicle = null;

        switch (typeOfVehicle.toLowerCase()) {
            case "car":
                vehicle = new Car();
                break;
            case "truck":
                vehicle = new Truck();
                break;
            case "motorcycle":
                vehicle = new MotorCycle();
                break;
            case "plane":
                vehicle = new Plane();
                break;
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + typeOfVehicle);
        }

        return vehicle;

    }
}
