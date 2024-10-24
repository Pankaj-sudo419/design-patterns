package factorydesignpattern;

import factorydesignpattern.factory.TransportFactory;

public class Client {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();
        Transport transport1 = transportFactory.getTransport("RoadWays");
        transport1.delivar();
        System.out.println(" ");
        Transport transport2 = transportFactory.getTransport("RailWays");
        transport2.delivar();
        System.out.println(" ");
        Transport transport3 = transportFactory.getTransport("Sea");
        transport3.delivar();
        System.out.println(" ");
        Transport transport4 = transportFactory.getTransport("AirWays");
        transport4.delivar();
        System.out.println(" ");
    }
}
