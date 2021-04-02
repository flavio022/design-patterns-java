package designpattern.abstractFactory.aircrafts;

public class AirPlane implements IAirCraftVehicle {
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo! Ligando turbinas");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 20km");
    }
}
