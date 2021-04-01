package designpattern.factory;

import designpattern.factory.vehicle.Car;
import designpattern.factory.vehicle.IVehicle;

public abstract class Transport {

    public void startTransport(){
        IVehicle vehicle = createTransport();

        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
