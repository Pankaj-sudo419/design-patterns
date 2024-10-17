package abstractfactorydesignpattern.implimentaions.productsimplimentations.modern;

import abstractfactorydesignpattern.interfaces.products.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on modern chair.....");
    }
}
