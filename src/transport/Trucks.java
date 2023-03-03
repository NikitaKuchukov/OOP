package transport;

import java.util.Currency;
import java.util.List;

public class Trucks extends Transport<DriverC> {
    private final Carrying carrying;

    public Trucks(String brand, String model, double engineVolume, DriverC driver, Carrying carrying, List<Mechanic> mechanic) {
        super(brand, model, engineVolume, driver, mechanic);
        this.carrying = carrying;
    }

    public void printDriverAndMechanic() {
        System.out.println("Truck: " + super.toString() + " " + getDriver() + ", " + getMechanicList());
    }

    public enum Carrying {
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);

        private final Float minBorder;
        private final Float maxBorder;

        Carrying(Float minBorder, Float maxBorder) {
            this.minBorder = minBorder;
            this.maxBorder = maxBorder;
        }

        public Float getMinBorder() {
            return minBorder;
        }

        public Float getMaxBorder() {
            return maxBorder;
        }

        @Override
        public String toString() {
            if (minBorder == null) {
                return "{Грузоподъемность: до " + maxBorder + " тонн}";
            } else if (maxBorder == null) {
                return "{Грузоподъемность: свыше " + minBorder + " тонн}";
            } else {
                return "{Грузоподъемность: " +
                        "от " + minBorder +
                        " до " + maxBorder + " тонн}";
            }
        }
    }

    @Override
    public Type getType() {
        return Type.TRUCKS;
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
        System.out.println("Truck " + getBrand() + " has started moving");

    }

    @Override
    public void finishMove() {
        System.out.println("Truck " + getBrand() + " has finished moving");

    }

    @Override
    public void passTheDiagnostic() {
        System.out.println("Truck being diagnosed");
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
        return "Truck: " + super.toString() + " " + carrying + " " + getMechanicList();
    }
}
