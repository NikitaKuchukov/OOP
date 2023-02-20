package transport;

import java.util.Currency;

public class Trucks extends Transport<DriverC> {
    private static Carrying carrying;

    public Trucks(String brand, String model, double engineVolume, DriverC driver, Carrying carrying) {
        super(brand, model, engineVolume, driver);
    }

    public enum Carrying {
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);

        private Float minBorder;
        private Float maxBorder;

        Carrying(Float minBorder, Float maxBorder) {
            this.minBorder = minBorder;
            this.maxBorder = maxBorder;
        }

        @Override
        public String toString() {
            String str;
            if (minBorder == null) {
                str = "Грузоподъемность: до " + maxBorder + " тонн";
            } else if (maxBorder == null) {
                str = "Грузоподъемность: свыше " + minBorder + " тонн";
            } else {
                str = "Грузоподъемность: " +
                        "от " + minBorder +
                        " до " + maxBorder + " тонн";
            }
            return str;
        }

        public Carrying getCarrying() {
            return carrying;
        }

        public float getMinBorder() {
            return minBorder;

        }

        public float getMaxBorder() {
            return maxBorder;
        }

        public void setMinBorder(float minBorder) {
            this.minBorder = minBorder;
        }

        public void setMaxBorder(float maxBorder) {
            this.maxBorder = maxBorder;
        }
    }

    public static Carrying getCarrying() {
        return carrying;
    }

    @Override
    public Type getType() {
        return Type.TRUCKS;
    }

    @Override
    public void printType() {
        if (getCarrying() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getCarrying());
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
        return "Truck: " + super.toString() + " " + carrying;
    }
}
