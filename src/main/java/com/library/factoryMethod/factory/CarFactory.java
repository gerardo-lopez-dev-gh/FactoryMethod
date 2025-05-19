package com.library.factoryMethod.factory;

import com.library.factoryMethod.Vehicle;
import com.library.factoryMethod.models.Car;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
