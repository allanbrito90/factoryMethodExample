package org.hrcode.designpatterns.factory;

import org.hrcode.designpatterns.factory.vehicles.Bike;
import org.hrcode.designpatterns.factory.vehicles.IVehicle;

public class BikeTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
