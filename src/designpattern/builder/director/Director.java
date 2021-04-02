package designpattern.builder.director;

import designpattern.builder.builders.IBuilder;
import designpattern.builder.componets.CarType;
import designpattern.builder.componets.Engine;
import designpattern.builder.componets.Transmission;

public class Director {
    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setEngine(new Engine(1600));
        builder.setTransmission(Transmission.AUTOMATIC);
    }
    public void constructTruckCar(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setEngine(new Engine(13000));
        builder.setTransmission(Transmission.MANUAL);
    }
    public void constructSportCar(IBuilder builder){
        builder.setCarType(CarType.SPORTCAR);
        builder.setSeats(5);
        builder.setEngine(new Engine(1900));
        builder.setTransmission(Transmission.AUTOMATIC);
    }
}
