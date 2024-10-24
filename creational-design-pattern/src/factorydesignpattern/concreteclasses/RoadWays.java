package factorydesignpattern.concreteclasses;

import factorydesignpattern.Transport;

public class RoadWays implements Transport {
    @Override
    public void delivar() {
        System.out.println("Items are transported via RoadWays");
    }
}
