package designpattern.abstractFactory.factories;

import designpattern.abstractFactory.aircrafts.Helicopter;
import designpattern.abstractFactory.aircrafts.IAirCraftVehicle;
import designpattern.abstractFactory.landvehicles.ILandVehicles;
import designpattern.abstractFactory.landvehicles.MotorCycle;
import designpattern.abstractFactory.seavehicles.ISeaVehicles;
import designpattern.abstractFactory.seavehicles.Ship;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicles createLandTransportVehicle() {
        return new MotorCycle();
    }

    @Override
    public IAirCraftVehicle createAirCraftVehicle() {
        return new Helicopter();
    }

    @Override
    public ISeaVehicles createSeaVehicles() {
        return new Ship();
    }
}
