package transport;

public class Buses extends Transport<DriverD> {
    public Buses(String brand, String model, double engineVolume, DriverD driver, Capacity capacity) {
        super(brand, model, engineVolume, driver);
    }

    private static Capacity capacity;

    public enum Capacity {
        VERY_SMALL(null, 10),
        SMALL(10, 25),
        MIDDLE(25, 50),
        BIG(50, 80),
        VERY_BIG(80, 100);

        private Integer minBorder;
        private Integer maxBorder;

        Capacity(Integer minBorder, Integer maxBorder) {
            this.minBorder = minBorder;
            this.maxBorder = maxBorder;
        }

        @Override
        public String toString() {
            if (minBorder == null) {
                return "Вместимость: до " + maxBorder + " мест";
            } else {
                return "Вместимость: " + minBorder +
                        " - " + maxBorder + " мест";
            }
        }

        public Capacity getCapacity() {
            return capacity;
        }

        public int getMinBorder() {
            return minBorder;
        }

        public int getMaxBorder() {
            return maxBorder;
        }

        public void setMinBorder(int minBorder) {
            this.minBorder = minBorder;
        }

        public void setMaxBorder(int maxBorder) {
            this.maxBorder = maxBorder;
        }
    }

    public static Capacity getCapacity() {
        return capacity;
    }

    @Override
    public Type getType() {
        return Type.BUSES;
    }

    @Override
    public void printType() {
        if (getCapacity() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getCapacity());
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
        return "Bus: " + super.toString() + " " + capacity;
    }
}
