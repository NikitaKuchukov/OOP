package transport;

import java.util.List;
import java.util.Objects;

public class Cars extends Transport<DriverB> {
    private final BodyType bodyType;

    public Cars(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType, List<Mechanic> mechanic) {
        super(brand, model, engineVolume, driver, mechanic);
        this.bodyType = bodyType;
    }

    public void printDriverAndMechanic() {
        System.out.println("Car: " + super.toString() + " " + getDriver() + ", " + getMechanicList());
    }

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбэк"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивен");

        private final String type;

        BodyType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "{Тип кузова: " + type + "}";
        }
    }

    @Override
    public Type getType() {
        return Type.CARS;
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
        System.out.println("Car " + getBrand() + " has started moving");
    }

    @Override
    public void finishMove() {
        System.out.println("Car " + getBrand() + " has started moving");

    }

    @Override
    public void passTheDiagnostic() {
        System.out.println("Car being diagnosed");
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

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cars)) {
            return false;
        }
        Cars car = (Cars) o;
        return super.equals(o) && Objects.equals(car.getBodyType(), bodyType);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Car: " + super.toString() + " " + bodyType + " " + getMechanicList();
    }
}
