package domain;

public class Servicing

    private final int id;
    private final int mileage;
    private final String type;

    private Servicing(uilder) {
        this.id = builder.id;
        this.mileage = builder.mileage;
        this.type = builder.type;
    }

    
    public int getId() {
        return id;
    }

    public int getMileage() {
        return mileage;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "id=" + id +
                ", mileage=" + mileage +
                ", type='" + type + '\'' +
                '}';
    }

    
    public static class Builder {
        private int id;
        private int mileage;
        private String type;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Revision build() {
            return new Revision(this);
        }
    }
}
