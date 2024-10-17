package abstractfactorydesignpattern.implimentaions.productsimplimentations.victorian;

import abstractfactorydesignpattern.interfaces.products.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void putItemOn() {
        System.out.println("Put coffee on Victorian Coffee Table.....");
    }
}
