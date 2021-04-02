package designpattern.abstractFactory.app;

import designpattern.abstractFactory.aircrafts.IAirCraftVehicle;
import designpattern.abstractFactory.factories.ITransportFactory;
import designpattern.abstractFactory.landvehicles.ILandVehicles;

public class Application {

    public ILandVehicles landVehicles;
    public IAirCraftVehicle airCraftVehicle;

    public Application(ITransportFactory factory){
        landVehicles = factory.createLandTransportVehicle();
        airCraftVehicle = factory.createAirCraftVehicle();
    }
    public void startRoute(){
        airCraftVehicle.startRoute();
        landVehicles.startRoute();
    }
}
