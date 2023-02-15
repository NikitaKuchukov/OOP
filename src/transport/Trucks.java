package transport;

public class Trucks extends Transport<DriverC> {
    public Trucks(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Truck " + getBrand() + " has started moving");

    }

    @Override
    public void finishMove() {
        System.out.println("Truck " + getBrand() + " has finished moving");

    }

    public void pitStop() {
        System.out.println("Pit Stop for truck");
    }

    @Override
    public void theBestLapTime() {
        System.out.println("The best lap time for truck: 2 min 34 sec");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed for car: 180 km/h");
    }

    @Override
    public String toString() {
        return "Truck: " + super.toString();
    }
}
