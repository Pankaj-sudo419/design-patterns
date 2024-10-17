package abstractfactorydesignpattern.implimentaions.factoryimplimentations;

import abstractfactorydesignpattern.implimentaions.productsimplimentations.victorian.VictorianChair;
import abstractfactorydesignpattern.implimentaions.productsimplimentations.victorian.VictorianCoffeeTable;
import abstractfactorydesignpattern.implimentaions.productsimplimentations.victorian.VictorianSofa;
import abstractfactorydesignpattern.interfaces.factory.FurnitureFactory;
import abstractfactorydesignpattern.interfaces.products.Chair;
import abstractfactorydesignpattern.interfaces.products.CoffeeTable;
import abstractfactorydesignpattern.interfaces.products.Sofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
