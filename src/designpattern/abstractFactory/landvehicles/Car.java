package designpattern.abstractFactory.landvehicles;

public class Car implements ILandVehicles{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciiando trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Buscando Passageiros");
    }
}
