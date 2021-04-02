package designpattern.abstractFactory.aircrafts;

public class Helicopter implements IAirCraftVehicle {
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Inciando decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo! Ligando hélices.");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 2km, sudeste! ventos ok");
    }
}
