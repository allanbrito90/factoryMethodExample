package org.hrcode.designpatterns.factory.vehicles;

public class Bike implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando rota");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegou encomenda");
    }
}
