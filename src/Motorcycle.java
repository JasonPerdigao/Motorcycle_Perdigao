/**
 * Project: Lab 1.5 Motorcycle
 * Purpose Details: Defines a motorcycle object
 * Course: Java
 * Author: Jason Perdigao
 * Date Developed: 10/12/2026
 * Last Date Changed: 10/25/2026
 * Revision: 9.0
 */
public class Motorcycle {
    private String make;
    private String model;
    private int year;
    private String color;
    private Engine engine;
    private Wheel wheel;
    private FuelTank fuelTank;
    private Transmission transmission;
    private Brake brake;

    public Motorcycle(String make, String model, int year, String color, Engine engine, Wheel wheel, FuelTank fuelTank, Transmission transmission, Brake brake) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
        this.wheel = wheel;
        this.fuelTank = fuelTank;
        this.transmission = transmission;
        this.brake = brake;
    }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public Engine getEngine() { return engine; }
    public void setEngine(Engine engine) { this.engine = engine; }
    public Wheel getWheel() { return wheel; }
    public void setWheel(Wheel wheel) { this.wheel = wheel; }
    public FuelTank getFuelTank() { return fuelTank; }
    public void setFuelTank(FuelTank fuelTank) { this.fuelTank = fuelTank; }
    public Transmission getTransmission() { return transmission; }
    public void setTransmission(Transmission transmission) { this.transmission = transmission; }
    public Brake getBrake() { return brake; }
    public void setBrake(Brake brake) { this.brake = brake; }
}
