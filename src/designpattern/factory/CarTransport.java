package designpattern.factory;

import designpattern.factory.vehicle.Car;
import designpattern.factory.vehicle.IVehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
