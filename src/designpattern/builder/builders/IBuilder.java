package designpattern.builder.builders;

import designpattern.builder.componets.CarType;
import designpattern.builder.componets.Engine;
import designpattern.builder.componets.Transmission;

public interface IBuilder {

    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);

}
