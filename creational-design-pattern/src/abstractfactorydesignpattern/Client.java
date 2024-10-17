package abstractfactorydesignpattern;

import abstractfactorydesignpattern.interfaces.factory.FurnitureFactory;
import abstractfactorydesignpattern.interfaces.products.Chair;
import abstractfactorydesignpattern.interfaces.products.CoffeeTable;
import abstractfactorydesignpattern.interfaces.products.Sofa;

public class Client {

    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    public Client(FurnitureFactory factory){
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
    }

    public void useFurniture(){
        chair.sitOn();
        sofa.layOn();
        coffeeTable.putItemOn();
    }
}
