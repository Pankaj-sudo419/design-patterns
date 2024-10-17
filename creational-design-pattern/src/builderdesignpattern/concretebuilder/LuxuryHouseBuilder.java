package builderdesignpattern.concretebuilder;

import builderdesignpattern.builder.HouseBuilder;
import builderdesignpattern.product.House;

public class LuxuryHouseBuilder implements HouseBuilder {
    private House house;

    public LuxuryHouseBuilder() {
        this.house = new House();
    }

    public void buildWalls() {
        house.setWalls("Luxury Walls");
    }

    public void buildDoors() {
        house.setDoors("Luxury Doors");
    }

    public void buildWindows() {
        house.setWindows("Large Windows");
    }

    public void buildRoof() {
        house.setRoof("Luxury Roof");
    }

    public void buildFloor() {
        house.setFloor("Marble Floor");
    }

    public void addBackyard() {
        house.setBackyard(true);
    }

    public void addHeatingSystem() {
        house.setHeatingSystem(true);
    }

    public void addPlumbing() {
        house.setPlumbing(true);
    }

    public void addElectricalWiring() {
        house.setElectricalWiring(true);
    }

    public House getHouse() {
        return this.house;
    }
}