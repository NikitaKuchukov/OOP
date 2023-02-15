package transport;

public class Cars extends Transport<DriverB> {
    public Cars(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Car " + getBrand() + " has started moving");
    }

    @Override
    public void finishMove() {
        System.out.println("Car " + getBrand() + " has started moving");

    }

    @Override
    public void pitStop() {
        System.out.println("Pit Stop for car");
    }

    @Override
    public void theBestLapTime() {
        System.out.println("The best lap time for car: 1 min 21 sec");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed for car: 240 km/h");
    }

    @Override
    public String toString() {
        return "Car: " + super.toString();
    }
}
