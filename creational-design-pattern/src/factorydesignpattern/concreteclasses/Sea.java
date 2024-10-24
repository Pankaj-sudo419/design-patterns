package factorydesignpattern.concreteclasses;

import factorydesignpattern.Transport;

public class Sea implements Transport {
    @Override
    public void delivar() {
        System.out.println("Items are shipped via Sea");
    }
}
