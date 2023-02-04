public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
        this.model = (model == null || model.isEmpty() ? "default" : model);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.color = (color == null || color.isEmpty() ? "White" : color);
        this.year = (year <= 0 ? 2000 : year);
        this.country = (country == null || country.isEmpty() ? "default" : country);
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
                '}';
    }
}
