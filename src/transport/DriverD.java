package transport;

import java.util.Set;

public class DriverD extends Driver {
    public DriverD(String name, boolean drivingLicense, int experience) {
        super(name, drivingLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Category D driver " + getName()+" has started move");
    }

    @Override
    public void finishMove() {
        System.out.println("Category D driver " + getName()+" has finished move");
    }

    @Override
    public void refuel() {
        System.out.println("Category D driver " + getName()+" refuels");
    }
}
