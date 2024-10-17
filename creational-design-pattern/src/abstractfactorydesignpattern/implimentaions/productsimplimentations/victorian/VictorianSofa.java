package abstractfactorydesignpattern.implimentaions.productsimplimentations.victorian;

import abstractfactorydesignpattern.interfaces.products.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void layOn() {
        System.out.println("Please lay on Victorian sofa.....");
    }
}
