/**
 * Project: Lab 1.5 Motorcycle
 * Purpose Details: Defines a motorcycle object
 * Course: Java
 * Author: Jason Perdigao
 * Date Developed: 10/12/2026
 * Last Date Changed: 10/25/2026
 * Revision: 9.0
 */


public class Wheel {
    private int size;
    private String brand;

    public Wheel(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    public int getSize() { return size; }
    public void setSize(int size) { this.size = size; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
}
