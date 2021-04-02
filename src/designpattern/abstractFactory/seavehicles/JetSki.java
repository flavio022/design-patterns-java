package designpattern.abstractFactory.seavehicles;

public class JetSki implements ISeaVehicles{
    @Override
    public void startRoute() {
        checkOcean();
        getCargo();
        System.out.println("Iniciando rota!");
    }

    @Override
    public void getCargo() {
        System.out.println("Mercadorias abordo!");
    }

    @Override
    public void checkOcean() {
        System.out.println("Mar com poucas ondas! Tudo ok");
    }
}
