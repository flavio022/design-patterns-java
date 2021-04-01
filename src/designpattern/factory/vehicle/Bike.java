package designpattern.factory.vehicle;

public class Bike implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Comida retirada");
    }
}
