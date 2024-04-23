package org.hrcode.designpatterns.factory;

import org.hrcode.designpatterns.factory.vehicles.IVehicle;
import org.hrcode.designpatterns.factory.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
