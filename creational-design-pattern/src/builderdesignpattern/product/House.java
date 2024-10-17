package builderdesignpattern.product;


public class House {
    private String walls;
    private String doors;
    private String windows;
    private String roof;
    private String floor;
    private boolean hasBackyard;
    private boolean hasHeatingSystem;
    private boolean hasPlumbing;
    private boolean hasElectricalWiring;

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setBackyard(boolean hasBackyard) {
        this.hasBackyard = hasBackyard;
    }

    public void setHeatingSystem(boolean hasHeatingSystem) {
        this.hasHeatingSystem = hasHeatingSystem;
    }

    public void setPlumbing(boolean hasPlumbing) {
        this.hasPlumbing = hasPlumbing;
    }

    public void setElectricalWiring(boolean hasElectricalWiring) {
        this.hasElectricalWiring = hasElectricalWiring;
    }

    @Override
    public String toString() {
        return "House [walls=" + walls + ", doors=" + doors + ", windows=" + windows +
                ", roof=" + roof + ", floor=" + floor + ", hasBackyard=" + hasBackyard +
                ", hasHeatingSystem=" + hasHeatingSystem + ", hasPlumbing=" + hasPlumbing +
                ", hasElectricalWiring=" + hasElectricalWiring + "]";
    }
}
