package transport;

import java.io.IOException;

public class Buses extends Transport<DriverD> {
    public Buses(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Bus " + getBrand() + " has started moving");

    }

    @Override
    public void finishMove() {
        System.out.println("Bus " + getBrand() + " has started moving");

    }

    @Override
    public void passTheDiagnostic() throws TransportTypeException {
        throw new TransportTypeException("Buses don't pass diagnostic");
    }

    public void pitStop() {
        System.out.println("Pit Stop for bus");
    }

    @Override
    public void theBestLapTime() {
        System.out.println("The best lap time for car: 3 min 19 sec");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed for bus: 140 km/h");
    }

    @Override
    public String toString() {
        return "Bus: " + super.toString();
    }
}
