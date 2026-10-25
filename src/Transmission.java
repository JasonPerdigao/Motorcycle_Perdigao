/**
 * Project: Lab 1.5 Motorcycle
 * Purpose Details: Defines a motorcycle object
 * Course: Java
 * Author: Jason Perdigao
 * Date Developed: 10/12/2026
 * Last Date Changed: 10/24/2026
 * Revision: 9.0
 */


public class Transmission {

    private int gears;
    private String type;

    public Transmission(int gears, String type) {
        this.gears = gears;
        this.type = type;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}