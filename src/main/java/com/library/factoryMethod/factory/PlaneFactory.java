package com.library.factoryMethod.factory;

import com.library.factoryMethod.Vehicle;
import com.library.factoryMethod.models.Plane;

public class PlaneFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }
}
