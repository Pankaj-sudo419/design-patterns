package factorydesignpattern.factory;

import factorydesignpattern.Transport;
import factorydesignpattern.concreteclasses.AirWays;
import factorydesignpattern.concreteclasses.RailWays;
import factorydesignpattern.concreteclasses.RoadWays;
import factorydesignpattern.concreteclasses.Sea;

public class TransportFactory {
    public Transport getTransport(String type){
        if(type == null){
            return null;
        }

        if(type.equalsIgnoreCase("RailWays")){
            return new RailWays();
        }

        else if(type.equalsIgnoreCase("RoadWays")){
            return new RoadWays();
        }

        else if(type.equalsIgnoreCase("Sea")){
            return new Sea();
        }
        else if(type.equalsIgnoreCase("AirWays")){
            return new AirWays();
        }

        return  null;
    }
}
