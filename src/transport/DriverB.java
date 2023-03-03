package transport;

public class DriverB extends Driver {
    public DriverB(String name, boolean drivingLicense, int experience) {
        super(name, drivingLicense, experience);
    }


    @Override
    public void startMove() {
        System.out.println("Category B driver " + getName()+" has started move");
    }

    @Override
    public void finishMove() {
        System.out.println("Category B driver " + getName()+" has finished move");
    }

    @Override
    public void refuel() {
        System.out.println("Category B driver " + getName()+" refuels");
    }
}
