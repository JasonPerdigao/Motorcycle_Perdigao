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
