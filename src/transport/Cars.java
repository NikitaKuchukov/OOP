package transport;

public class Cars extends Transport<DriverB> {
    private BodyType bodyType;

    public Cars(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
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

        private String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + bodyType;
        }
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public Type getType() {
        return Type.CARS;
    }

    @Override
    public void printType() {
        if (getBodyType() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getBodyType());
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
        return "Car: " + super.toString() + " " + bodyType;
    }
}
