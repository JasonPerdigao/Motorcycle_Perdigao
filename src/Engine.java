/**
 * Project: Lab 1.5 Motorcycle
 * Purpose Details: Defines a motorcycle object
 * Course: Java
 * Author: Jason Perdigao
 * Date Developed: 10/12/2026
 * Last Date Changed: 10/25/2026
 * Revision: 9.0
 */


public class Engine {
    private int cc;
    private String type;

    public Engine(int cc, String type) {
        this.cc = cc;
        this.type = type;
    }

    public int getCc() { return cc; }
    public void setCc(int cc) { this.cc = cc; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
