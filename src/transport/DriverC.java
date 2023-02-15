package transport;

public class DriverC extends Driver {
    public DriverC(String name, boolean drivingLicense, int experience) {
        super(name, drivingLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Category C driver " + getName()+" has started move");
    }

    @Override
    public void finishMove() {
        System.out.println("Category C driver " + getName()+" has finished move");
    }

    @Override
    public void refuel() {
        System.out.println("Category C driver " + getName()+" refuels");
    }
}
