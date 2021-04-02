package designpattern.abstractFactory.landvehicles;

public class MotorCycle implements ILandVehicles{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Pedido retirado");
    }
}
