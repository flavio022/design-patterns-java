package designpattern.abstractFactory.factories;

import designpattern.abstractFactory.aircrafts.IAirCraftVehicle;
import designpattern.abstractFactory.landvehicles.ILandVehicles;
import designpattern.abstractFactory.seavehicles.ISeaVehicles;

public interface ITransportFactory {
    ILandVehicles createLandTransportVehicle();
    IAirCraftVehicle createAirCraftVehicle();
    ISeaVehicles createSeaVehicles();
}
