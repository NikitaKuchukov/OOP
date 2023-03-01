package transport;

import java.io.IOException;

public class Buses extends Transport<DriverD> {
    private final Capacity capacity;

    public Buses(String brand, String model, double engineVolume, DriverD driver, Capacity capacity, Mechanic mechanic) {
        super(brand, model, engineVolume, driver, mechanic);
        this.capacity = capacity;
    }

    public void printDriverAndMechanic() {
        System.out.println("Bus: " + super.toString() + " " + getDriver() + ", " + getMechanic());
    }

    public enum Capacity {
        VERY_SMALL(null, 10),
        SMALL(10, 25),
        MIDDLE(25, 50),
        BIG(50, 80),
        VERY_BIG(80, 100);

        private final Integer minBorder;
        private final Integer maxBorder;

        Capacity(Integer minBorder, Integer maxBorder) {
            this.minBorder = minBorder;
            this.maxBorder = maxBorder;
        }

        public int getMinBorder() {
            return minBorder;
        }

        public int getMaxBorder() {
            return maxBorder;
        }

        @Override
        public String toString() {
            if (minBorder == null) {
                return "{Вместимость: до " + maxBorder + " мест}";
            } else {
                return "{Вместимость: " + minBorder +
                        " - " + maxBorder + " мест}";
            }
        }
    }

    @Override
    public Type getType() {
        return Type.BUSES;
    }

    @Override
    public void printType() {
        if (getType() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getType());
        }
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
        return "Bus: " + super.toString() + " " + capacity + " " + getMechanic();
    }
}
