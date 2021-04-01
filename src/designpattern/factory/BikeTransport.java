package designpattern.factory;

import designpattern.factory.vehicle.Bike;
import designpattern.factory.vehicle.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
