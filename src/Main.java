import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("Lada", "Granta", 2015, "Russia", "Yellow", 160, 1.8, "Mechanical", "Sedan", "A999AB999", 5, true, new Car.Key(true, false));
        cars[1] = new Car("", "A8 50 L", 2021, "Germany", "Green", 220, 2.4, "Automatic", "Coupe", "A666AB24", 5, false, new Car.Key(false, true));
        cars[2] = new Car("BMW", null, 2022, "Russia", "Black", 180, 2.5, "Mechanical", "Sedan", "A444AB112", 5, false, new Car.Key(true, true));
        cars[3] = new Car("Kia", "", 2019, "Germany", "Red", 240, 2.0, "Automatic", "Coupe", "A333AB777", 7, true, new Car.Key(false, false));
        cars[4] = new Car("Hyundai", "", 2020, null, "Blue", 190, 3.5, "Automatic", "Cross", "A111AB124", 7, true, new Car.Key(true, true));


        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        Bus bus1 = new Bus("Volvo", "B13R", 2009, "Sweden", "White", 100);
        Bus bus2 = new Bus("Daewoo", "BS106", 2010, "Korean", "Yellow", 90);
        Bus bus3 = new Bus("Liaz", "6213", 2015, "Russia", "Blue", 120);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

    }
}