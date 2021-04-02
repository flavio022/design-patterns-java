package designpattern.abstractFactory.factories;

import designpattern.abstractFactory.aircrafts.AirPlane;
import designpattern.abstractFactory.aircrafts.IAirCraftVehicle;
import designpattern.abstractFactory.landvehicles.Car;
import designpattern.abstractFactory.landvehicles.ILandVehicles;
import designpattern.abstractFactory.seavehicles.ISeaVehicles;
import designpattern.abstractFactory.seavehicles.JetSki;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicles createLandTransportVehicle() {
        return new Car();
    }

    @Override
    public IAirCraftVehicle createAirCraftVehicle() {
        return new AirPlane();
    }

    @Override
    public ISeaVehicles createSeaVehicles() {
        return new JetSki();
    }
}
