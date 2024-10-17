package builderdesignpattern;

import builderdesignpattern.concretebuilder.LuxuryHouseBuilder;
import builderdesignpattern.concretebuilder.SimpleHouseBuilder;
import builderdesignpattern.director.HouseDirector;
import builderdesignpattern.builder.HouseBuilder;
import builderdesignpattern.product.House;

public class Client {
    public static void main(String[] args) {
        // Building a simple house
        HouseBuilder simpleHouseBuilder = new SimpleHouseBuilder();
        HouseDirector simpleHouseDirector = new HouseDirector(simpleHouseBuilder);
        simpleHouseDirector.constructSimpleHouse();
        House simpleHouse = simpleHouseDirector.getHouse();
        System.out.println("Simple House: " + simpleHouse);

        // Building a luxury house
        HouseBuilder luxuryHouseBuilder = new LuxuryHouseBuilder();
        HouseDirector luxuryHouseDirector = new HouseDirector(luxuryHouseBuilder);
        luxuryHouseDirector.constructLuxuryHouse();
        House luxuryHouse = luxuryHouseDirector.getHouse();
        System.out.println("Luxury House: " + luxuryHouse);


    }
}