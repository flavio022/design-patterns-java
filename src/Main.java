import designpattern.factory.BikeTransport;
import designpattern.factory.CarTransport;
import designpattern.factory.MotorCicleTransport;
import designpattern.factory.Transport;

public class Main {
    private static Transport transport;

    public static void main(String args[]){
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
