public class Main {
    public static void main(String[] args) {
        Car Lada = new Car("Lada", "Granta", 0, "Yellow", 2015, "Russia");
        Car Audi = new Car("", "A8 50 L", 3.0, "Black", 2020, "Germany");
        Car BMW = new Car("BMW", null, 3.0, "Black", -3, "Germany");
        Car Kia = new Car("Kia", "", 2.4, "Red", 2018, "South Korea");
        Car Hyundai = new Car("Hyundai", "Avante", 1.6, null, 2016, "South Korea");

        System.out.println(Lada);
        System.out.println(Audi);
        System.out.println(BMW);
        System.out.println(Kia);
        System.out.println(Hyundai);
    }
}