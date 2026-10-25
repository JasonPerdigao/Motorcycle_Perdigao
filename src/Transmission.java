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