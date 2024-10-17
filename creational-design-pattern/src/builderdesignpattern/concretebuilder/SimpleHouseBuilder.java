package builderdesignpattern.concretebuilder;

import builderdesignpattern.builder.HouseBuilder;
import builderdesignpattern.product.House;

public class SimpleHouseBuilder implements HouseBuilder {
    private House house;

    public SimpleHouseBuilder() {
        this.house = new House();
    }

    public void buildWalls() {
        house.setWalls("Simple Walls");
    }

    public void buildDoors() {
        house.setDoors("Simple Door");
    }

    public void buildWindows() {
        house.setWindows("Simple Windows");
    }

    public void buildRoof() {
        house.setRoof("Simple Roof");
    }

    public void buildFloor() {
        house.setFloor("Simple Floor");
    }

    public void addBackyard() {
        house.setBackyard(false);
    }

    public void addHeatingSystem() {
        house.setHeatingSystem(false);
    }

    public void addPlumbing() {
        house.setPlumbing(false);
    }

    public void addElectricalWiring() {
        house.setElectricalWiring(false);
    }

    public House getHouse() {
        return this.house;
    }
}