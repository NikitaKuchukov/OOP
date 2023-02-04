public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("Lada", "Granta", 0, "Yellow", 2015, "Russia");
        cars[1] = new Car("", "A8 50 L", 3.0, "Black", 2020, "Germany");
        cars[2] = new Car("BMW", null, 3.0, "Black", -3, "Germany");
        cars[3] = new Car("Kia", "", 2.4, "Red", 2018, "South Korea");
        cars[4] = new Car("Hyundai", "Avante", 1.6, null, 2016, "South Korea");


        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
     /*   System.out.println(Lada);
        System.out.println(Audi);
        System.out.println(BMW);
        System.out.println(Kia);
        System.out.println(Hyundai);
    */}
}