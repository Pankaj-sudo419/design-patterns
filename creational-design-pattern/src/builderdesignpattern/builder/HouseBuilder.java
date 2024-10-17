package builderdesignpattern.builder;

import builderdesignpattern.product.House;

public interface HouseBuilder {
    void buildWalls();
    void buildDoors();
    void buildWindows();
    void buildRoof();
    void buildFloor();
    void addBackyard();
    void addHeatingSystem();
    void addPlumbing();
    void addElectricalWiring();
    House getHouse();
}