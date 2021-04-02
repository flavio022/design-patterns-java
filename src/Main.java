import designpattern.abstractFactory.app.Application;
import designpattern.abstractFactory.factories.ITransportFactory;
import designpattern.abstractFactory.factories.NineNineTransport;
import designpattern.abstractFactory.factories.UberTransport;
import designpattern.builder.builders.CarBuilder;
import designpattern.builder.builders.TruckBuilder;
import designpattern.builder.cars.Car;
import designpattern.builder.cars.Truck;
import designpattern.builder.director.Director;
import designpattern.factory.BikeTransport;
import designpattern.factory.CarTransport;
import designpattern.factory.MotorCicleTransport;
import designpattern.factory.Transport;

public class Main {
    private static Transport transport;

    public static Application configureApplication(){
        Application app;
        ITransportFactory factory;

        String company = "NineNine";
        if(company == "Uber"){
            factory = new UberTransport();
        }else {
            factory = new NineNineTransport();
        }
        app = new Application(factory);

        return app;
    }

    public static void main(String args[]){
        //Builder
        System.out.println("--------Builder---------");

        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSedanCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println(car.getCarType() + " Produzindo com sucesso");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruckCar(truckBuilder);
        Truck truck = truckBuilder.getResult();
        System.out.println(truckBuilder.getResult());

        director.constructSportCar(carBuilder);
        Car sportCar = carBuilder.getResult();

        System.out.println("--------Abstract Factory---------");
        //AbstractFactory
        Application app = configureApplication();
        app.startRoute();

        //Factory method
        System.out.println("--------Factory method---------");

        configure(args[0]);
        if (transport != null){
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch (type){
            case "ifood":
                transport = new BikeTransport();
                break;
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorCicleTransport();
            default:
                System.out.println("Selecione um tipo de entrega!");
        }
    }
}
