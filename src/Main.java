import designpattern.abstractFactory.app.Application;
import designpattern.abstractFactory.factories.ITransportFactory;
import designpattern.abstractFactory.factories.NineNineTransport;
import designpattern.abstractFactory.factories.UberTransport;
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
        //AbstractFactory
        Application app = configureApplication();
        app.startRoute();

        //Factory method
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
