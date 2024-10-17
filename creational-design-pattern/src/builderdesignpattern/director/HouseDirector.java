package builderdesignpattern.director;

import builderdesignpattern.builder.HouseBuilder;
import builderdesignpattern.product.House;

public class HouseDirector {
    private HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public void constructSimpleHouse() {
        builder.buildWalls();
        builder.buildDoors();
        builder.buildWindows();
        builder.buildRoof();
        builder.buildFloor();
        // No backyard, no heating, no plumbing, no electrical wiring
    }

    public void constructLuxuryHouse() {
        builder.buildWalls();
        builder.buildDoors();
        builder.buildWindows();
        builder.buildRoof();
        builder.buildFloor();
        builder.addBackyard();
        builder.addHeatingSystem();
        builder.addPlumbing();
        builder.addElectricalWiring();
    }

    public House getHouse() {
        return builder.getHouse();
    }
}

