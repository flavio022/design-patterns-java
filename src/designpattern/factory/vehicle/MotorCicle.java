package designpattern.factory.vehicle;

public class MotorCicle implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Peguei a entrega!");
    }
}
