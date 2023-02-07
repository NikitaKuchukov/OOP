import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("Lada", "Granta", 0, "Yellow", 2015, "Russia", "Mechanical", "Sedan", "A803AB999", 5, true, new Car.Key(true, false));
        cars[1] = new Car("", "A8 50 L", 3.0, "Black", 2020, "Germany", "Automatic", "Coupe", "P123YX777", 4, false, new Car.Key(false, true));
        cars[2] = new Car("BMW", null, 3.0, "Black", -3, "Germany", "Mechanical", "Sedan", "H777MM124", 5, false, new Car.Key(true, true));
        cars[3] = new Car("Kia", "", 2.4, "Red", 2018, "South Korea", "Automatic", "Sedan", "A444OA177", 7, true, new Car.Key(false, false));
        cars[4] = new Car("Hyundai", "Avante", 1.6, null, 2016, "South Korea", "Mechanical", "Cross", "B66BB122", 6, false, new Car.Key(true, true));


        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}