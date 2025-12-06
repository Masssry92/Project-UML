package domain;

public class Customer {

    private final int id;
    private final String name;
    private final Vehicle vehicle;

    private Customer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.vehicle = builder.vehicle;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }


    public static class Builder {
        private int id;
        private String name;
        private Vehicle vehicle;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
