package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String number;
    private final int numberOfSeats;
    private boolean summerTires;
    private Key key;

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String number, int numberOfSeats, boolean summerTires, Key key) {
        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
        this.model = (model == null || model.isEmpty() ? "default" : model);
        setEngineVolume(engineVolume);
        setColor(color);
        this.year = (year <= 0 ? 2000 : year);
        this.country = (country == null || country.isEmpty() ? "default" : country);
        setTransmission(transmission);
        this.bodyType = (bodyType == null || bodyType.isEmpty() ? "Sedan" : bodyType);
        setNumber(number);
        this.numberOfSeats = (numberOfSeats <= 0 ? 5 : numberOfSeats);
        this.summerTires = summerTires;
        setKey(key);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getNumber() {
        return number;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
    }

    public void setColor(String color) {
        this.color = (color == null || color.isEmpty() ? "White" : color);
    }

    public void setTransmission(String transmission) {
        this.transmission = (transmission == null || transmission.isEmpty() ? "Mechanical" : transmission);
    }

    public void setNumber(String number) {
        this.number = (number == null || number.isEmpty() ? "А001АА000" : number);
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", number='" + number + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", tires=" + (summerTires ? "Summer" : "Winter") +
                ", remoteEngineStart=" + (key.remoteEngineStart ? "+" : "-") +
                ", keylessAccess=" + (key.keylessAccess ? "+" : "-") +
                '}';
    }

    private void changeTires(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            summerTires = false;
        }
        if (month >= 4 && month <= 10) {
            summerTires = true;
        }
    }
}
