package domain;

import java.util.List;

public class Repair {

    private final int id;
    private final Servicing servicing;
    private final List<Tire> tires;

    private Repair(Builder builder) {
        this.id = builder.id;
        this.servicing = builder.servicing;
        this.tires = builder.tires;
    }

    
    public int getId() {
        return id;
    }

    public Servicing getServicing() {
        return servicing;
    }

    public List<Tire> getTires() {
        return tires;
    }

    @Override
    public String toString() {
        return "Repair{" +
                "id=" + id +
                ", servicing=" + servicing +
                ", tires=" + tires +
                '}';
    }

   
    public static class Builder {
        private int id;
        private Servicing servicing;
        private List<Tire> tires;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setServicing(Servicing servicing) {
            this.servicing = servicing;
            return this;
        }

        public Builder setTires(List<Tire> tires) {
            this.tires = tires;
            return this;
        }

        public Repair build() {
            return new Repair(this);
        }
    }
}
