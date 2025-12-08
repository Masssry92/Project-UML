package domain;

public class Motorbike extends Vehicle {
    private String model;
    private int displacement;

    public Motorbike(String plate, String brand, String model, int displacement) {
        super(plate, brand);
        this.model = model;
        this.displacement = displacement;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "plate='" + getPlate() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + model + '\'' +
                ", displacement=" + displacement +
                '}';
    }
}
