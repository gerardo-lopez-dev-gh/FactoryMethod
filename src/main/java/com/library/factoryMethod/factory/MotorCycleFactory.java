package com.library.factoryMethod.factory;

import com.library.factoryMethod.Vehicle;
import com.library.factoryMethod.models.MotorCycle;

public class MotorCycleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new MotorCycle();
    }
}
