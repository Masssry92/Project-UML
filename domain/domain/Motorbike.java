package domain;

public class Motorbike extends Vehicle {

    private final String model;
    private final int displacement;

    private Motorbike(Builder builder) {
        super(builder.plate, builder.brand);
        this.model = builder.model;
        this.displacement = builder.displacement;
    }

 
    public String getModel() {
        return model;
    }

    public int getDisplacement() {
        return displacement;
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


    public static class Builder {
        private String plate;
        private String brand;
        private String model;
        private int displacement;

        public Builder setPlate(String plate) {
            this.plate = plate;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setDisplacement(int displacement) {
            this.displacement = displacement;
            return this;
        }

        public Motorbike build() {
            return new Motorbike(this);
        }
    }
}
