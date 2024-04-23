package org.hrcode.designpatterns.factory;

import org.hrcode.designpatterns.factory.vehicles.Car;
import org.hrcode.designpatterns.factory.vehicles.IVehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
