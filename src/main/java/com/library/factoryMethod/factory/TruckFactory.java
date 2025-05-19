package com.library.factoryMethod.factory;

import com.library.factoryMethod.Vehicle;
import com.library.factoryMethod.models.Truck;

public class TruckFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
