package abstractfactorydesignpattern.implimentaions.productsimplimentations.modern;

import abstractfactorydesignpattern.interfaces.products.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {

    @Override
    public void putItemOn() {
        System.out.println("Put coffee on modern coffee table.....");
    }
}
