package abstractfactorydesignpattern.implimentaions.productsimplimentations.victorian;

import abstractfactorydesignpattern.interfaces.products.Chair;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Please sit on Victorian chair ......");
    }
}
