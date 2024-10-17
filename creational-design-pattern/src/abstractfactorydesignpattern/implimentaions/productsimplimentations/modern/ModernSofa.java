package abstractfactorydesignpattern.implimentaions.productsimplimentations.modern;

import abstractfactorydesignpattern.interfaces.products.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void layOn() {
        System.out.println("Laying on modern sofa...");
    }
}
