package abstractfactorydesignpattern.implimentaions.factoryimplimentations;

import abstractfactorydesignpattern.implimentaions.productsimplimentations.modern.ModernChair;
import abstractfactorydesignpattern.implimentaions.productsimplimentations.modern.ModernCoffeeTable;
import abstractfactorydesignpattern.implimentaions.productsimplimentations.modern.ModernSofa;
import abstractfactorydesignpattern.interfaces.factory.FurnitureFactory;
import abstractfactorydesignpattern.interfaces.products.Chair;
import abstractfactorydesignpattern.interfaces.products.CoffeeTable;
import abstractfactorydesignpattern.interfaces.products.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
