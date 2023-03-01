import transport.*;

import java.util.*;

public class Main {
    public static void printLine() {
        System.out.println("-----------------------------------------------");
    }

    public static void main(String[] args) {

        DriverB[] driverB = new DriverB[4];
        driverB[0] = new DriverB("Anton", true, 3);
        driverB[1] = new DriverB("Evgeniy", false, 4);
        driverB[2] = new DriverB("Nikita", true, 2);
        driverB[3] = new DriverB("Grigoriy", true, 3);

        DriverC[] driverC = new DriverC[4];
        driverC[0] = new DriverC("Dmitriy", true, 4);
        driverC[1] = new DriverC("Konstantin", false, 5);
        driverC[2] = new DriverC("Roman", true, 6);
        driverC[3] = new DriverC("Andrey", false, 5);

        DriverD[] driverD = new DriverD[4];
        driverD[0] = new DriverD("Aleksey", true, 8);
        driverD[1] = new DriverD("Pavel", true, 9);
        driverD[2] = new DriverD("Artem", false, 11);
        driverD[3] = new DriverD("Yriy", true, 10);

        List<Mechanic> mechanic = new ArrayList<>(4);
        mechanic.add(new Mechanic("Anton", "Specialists"));
        mechanic.add(new Mechanic("Vasiliy", "Professionals"));
        mechanic.add(new Mechanic("Igor", "The best company"));
        mechanic.add(new Mechanic("Ivan", "Funny mechanics"));

        Cars[] car = new Cars[4];
        car[0] = new Cars("BMW", "530L", 3.0, driverB[0], Cars.BodyType.COUPE, mechanic.get(0));
        car[1] = new Cars("Audi", "A8", 4.2, driverB[2], Cars.BodyType.VAN, mechanic.get(1));
        car[2] = new Cars("Mercedes", "S600", 5.0, driverB[1], Cars.BodyType.SEDAN, mechanic.get(2));
        car[3] = new Cars("Nissan", "Primera", 1.8, driverB[3], Cars.BodyType.CROSSOVER, mechanic.get(3));

        Trucks[] truck = new Trucks[4];
        truck[0] = new Trucks("Kamaz", "1660", 6.0, driverC[2], Trucks.Carrying.N1, mechanic.get(0));
        truck[1] = new Trucks("Volvo", "Z8800", 5.5, driverC[1], Trucks.Carrying.N2, mechanic.get(1));
        truck[2] = new Trucks("Mercedes", "T440", 5.0, driverC[0], Trucks.Carrying.N3, mechanic.get(2));
        truck[3] = new Trucks("Shachman", "X3000", 6.5, driverC[3], Trucks.Carrying.N2, mechanic.get(3));

        Buses[] bus = new Buses[4];
        bus[0] = new Buses("Volvo", "B13R", 4.0, driverD[3], Buses.Capacity.SMALL, mechanic.get(0));
        bus[1] = new Buses("Daewoo", "BS106", 3.8, driverD[1], Buses.Capacity.BIG, mechanic.get(1));
        bus[2] = new Buses("Volvo", "B16R", 4.2, driverD[0], Buses.Capacity.VERY_SMALL, mechanic.get(2));
        bus[3] = new Buses("Liaz", "6213", 3.5, driverD[2], Buses.Capacity.VERY_BIG, mechanic.get(3));


        for (Cars cars : car) {
            if (cars.getDriver().isDrivingLicense()) {
                System.out.println("Category B driver " + cars.getDriver().getName() + " drives a car " + cars.getBrand() + " and will participate in the race");
            } else {
                System.out.println("Category B driver " + cars.getDriver().getName() + " drives a car " + cars.getBrand() + " and won't participate in the race");
            }
        }
        for (Trucks trucks : truck) {
            if (trucks.getDriver().isDrivingLicense()) {
                System.out.println("Category C driver " + trucks.getDriver().getName() + " drives a truck " + trucks.getBrand() + " and will participate in the race");
            } else {
                System.out.println("Category C driver " + trucks.getDriver().getName() + " drives a truck " + trucks.getBrand() + " and won't participate in the race");
            }
        }
        for (Buses buses : bus) {
            if (buses.getDriver().isDrivingLicense()) {
                System.out.println("Category D driver " + buses.getDriver().getName() + " drives a bus " + buses.getBrand() + " and will participate in the race");
            } else {
                System.out.println("Category D driver " + buses.getDriver().getName() + " drives a bus " + buses.getBrand() + " and won't participate in the race");
            }
        }
        printLine();

        car[2].printDriverAndMechanic();
        car[3].printDriverAndMechanic();
        bus[1].printDriverAndMechanic();
        truck[3].printDriverAndMechanic();

        printLine();

        List<Transport> transportList = new ArrayList<>(12);
        transportList.addAll(Arrays.asList(car));
        transportList.addAll(Arrays.asList(truck));
        transportList.addAll(Arrays.asList(bus));

        Queue<Transport> queue = new LinkedList<>();

        ServiceStation serviceStation = new ServiceStation(queue);
        serviceStation.addTransportToQueue(car[1]);
        serviceStation.addTransportToQueue(car[3]);
        serviceStation.addTransportToQueue(truck[0]);
        serviceStation.addTransportToQueue(truck[2]);
        serviceStation.addTransportToQueue(bus[1]);
        serviceStation.addTransportToQueue(bus[3]);

        System.out.println("queue.size = " + queue.size());

        serviceStation.passTheDiagnostic();
        System.out.println("queue.size = " + queue.size());
    }
}
