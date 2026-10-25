/**
 * Project: Lab 1.5 Motorcycle
 * Purpose Details: Defines a motorcycle object
 * Course: Java
 * Author: Jason Perdigao
 * Date Developed: 10/12/2026
 * Last Date Changed: 10/25/2026
 * Revision: 9.0
 */


public class Brake {

    private String type;
    private String brand;

    public Brake(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}