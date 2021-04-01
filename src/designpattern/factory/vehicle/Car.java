package designpattern.factory.vehicle;

public class Car implements IVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o Trajeto!");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros");
    }
}
