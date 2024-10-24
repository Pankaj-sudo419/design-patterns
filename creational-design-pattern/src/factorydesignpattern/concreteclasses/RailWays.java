package factorydesignpattern.concreteclasses;

import factorydesignpattern.Transport;

public class RailWays implements Transport {
    @Override
    public void delivar() {
        System.out.println("Items are TransPorted bt Railways");
    }
}
