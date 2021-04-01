package designpattern.factory;

import designpattern.factory.vehicle.IVehicle;
import designpattern.factory.vehicle.MotorCicle;

public class MotorCicleTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new MotorCicle();
    }
}
