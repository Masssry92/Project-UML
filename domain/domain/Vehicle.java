package domain;

public abstract class Vehicle {

    protected final String plate;
    protected final String brand;

    protected Vehicle(Builder<?> builder) {
        this.plate = builder.plate;
        this.brand = builder.brand;
    }

    
    public String getPlate() {
        return plate;
    }

    public String getBrand() {
        return brand;
    }


    public static abstract class Builder<T extends Builder<T>> {

        protected String plate;
        protected String brand;

        public T setPlate(String plate) {
            this.plate = plate;
            return self();
        }

        public T setBrand(String brand) {
            this.brand = brand;
            return self();
        }

        
        protected abstract T self();

    
        public abstract Vehicle build();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
