package domain;

public class Car extends Vehicle {

    private final String gearbox;

    private Car(Builder builder) {
        super(builder.plate, builder.brand);
        this.gearbox = builder.gearbox;
    }

    public String getGearbox() {
        return gearbox;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plate='" + getPlate() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", gearbox='" + gearbox + '\'' +
                '}';
    }


    public static class Builder {
        private String plate;
        private String brand;
        private String gearbox;

        public Builder setPlate(String plate) {
            this.plate = plate;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setGearbox(String gearbox) {
            this.gearbox = gearbox;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}