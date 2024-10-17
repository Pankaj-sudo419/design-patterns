package abstractfactorydesignpattern.interfaces.factory;

import abstractfactorydesignpattern.interfaces.products.Chair;
import abstractfactorydesignpattern.interfaces.products.CoffeeTable;
import abstractfactorydesignpattern.interfaces.products.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
