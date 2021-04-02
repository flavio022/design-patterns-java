package designpattern.abstractFactory.seavehicles;

public class Ship implements ISeaVehicles{
    @Override
    public void startRoute() {
        checkOcean();
        getCargo();
        System.out.println("Iniciando rota maritima");
    }

    @Override
    public void getCargo() {
        System.out.println("Cargas abordo!");
    }

    @Override
    public void checkOcean() {
        System.out.println("o Oceano está calmo");
    }
}
