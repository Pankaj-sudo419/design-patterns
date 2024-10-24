package factorydesignpattern.concreteclasses;

import factorydesignpattern.Transport;

public class AirWays implements Transport {
    @Override
    public void delivar() {
        System.out.println("Items are transported by Airways");
    }
}
