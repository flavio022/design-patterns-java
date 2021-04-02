package designpattern.builder.builders;

import designpattern.builder.cars.Truck;
import designpattern.builder.componets.CarType;
import designpattern.builder.componets.Engine;
import designpattern.builder.componets.Transmission;

public class TruckBuilder implements IBuilder {

    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Truck getResult(){
        return new Truck(carType,seats,engine,transmission);
    }
}
