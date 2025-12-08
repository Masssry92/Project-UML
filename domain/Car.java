package domain;

public class Car extends Vehicle {
    private String gearbox;

    public Car(String plate, String brand, String gearbox) {
        super(plate, brand);
        this.gearbox = gearbox;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plate='" + getPlate() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", gearbox='" + gearbox + '\'' +
                '}';
    }
}
