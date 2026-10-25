/**
 * Project: Lab 1.5 Motorcycle
 * Purpose Details: Defines a motorcycle object
 * Course: Java
 * Author: Jason Perdigao
 * Date Developed: 10/12/2026
 * Last Date Changed: 10/24/2026
 * Revision: 9.0
 */


public class MotorcycleDemo {
    public static void main(String[] args) {
        Motorcycle bike1 = new Motorcycle(
                "Honda",
                "CBR600RR",
                2024,
                "Red",
                new Engine(600, "Inline Four"),
                new Wheel(17, "Michelin"),
                new FuelTank(4.8, "Premium"),
                new Transmission(6, "Manual"),
                new Brake("Disc", "Brembo")
        );

        Motorcycle bike2 = new Motorcycle(
                "Yamaha",
                "R1",
                2023,
                "Blue",
                new Engine(1000, "Inline Four"),
                new Wheel(17, "Dunlop"),
                new FuelTank(4.5, "Premium"),
                new Transmission(6, "Manual"),
                new Brake("Disc", "Yamaha")
        );

        Motorcycle bike3 = new Motorcycle(
                "Harley-Davidson",
                "Street Glide",
                2024,
                "Black",
                new Engine(1868, "V-Twin"),
                new Wheel(19, "Bridgestone"),
                new FuelTank(6.0, "Premium"),
                new Transmission(6, "Manual"),
                new Brake("Disc", "Harley-Davidson")
        );

        printMotorcycle(bike1);
        printMotorcycle(bike2);
        printMotorcycle(bike3);
    }

    public static void printMotorcycle(Motorcycle motorcycle) {
        System.out.println("-----------------------------");
        System.out.println("Make: " + motorcycle.getMake());
        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Year: " + motorcycle.getYear());
        System.out.println("Color: " + motorcycle.getColor());
        System.out.println("Engine CC: " + motorcycle.getEngine().getCc());
        System.out.println("Engine Type: " + motorcycle.getEngine().getType());
        System.out.println("Wheel Size: " + motorcycle.getWheel().getSize());
        System.out.println("Wheel Brand: " + motorcycle.getWheel().getBrand());
        System.out.println("Fuel Capacity: " + motorcycle.getFuelTank().getCapacity());
        System.out.println("Fuel Type: " + motorcycle.getFuelTank().getFuelType());
        System.out.println("Transmission Gears: " + motorcycle.getTransmission().getGears());
        System.out.println("Transmission Type: " + motorcycle.getTransmission().getType());
        System.out.println("Brake Type: " + motorcycle.getBrake().getType());
        System.out.println("Brake Brand: " + motorcycle.getBrake().getBrand());
    }
}
