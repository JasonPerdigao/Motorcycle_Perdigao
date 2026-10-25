/**
 * Project: Lab 1.5 Motorcycle
 * Purpose Details: Defines a motorcycle object
 * Course: Java
 * Author: Jason Perdigao
 * Date Developed: 10/12/2026
 * Last Date Changed: 10/24/2026
 * Revision: 9.0
 */


public class FuelTank {

    private double capacity;
    private String fuelType;

    public FuelTank(double capacity, String fuelType) {
        this.capacity = capacity;
        this.fuelType = fuelType;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
