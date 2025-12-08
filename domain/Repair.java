package fr.efrei.domain;

import java.util.List;

public class Repair {
    private int id;
    private Servicing servicing;   // 0..1
    private List<Tire> tires;      // 0..n

    public Repair(int id, Servicing servicing, List<Tire> tires) {
        this.id = id;
        this.servicing = servicing;
        this.tires = tires;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Servicing getServicing() { return servicing; }
    public void setServicing(Servicing servicing) { this.servicing = servicing; }

    public List<Tire> getTires() { return tires; }
    public void setTires(List<Tire> tires) { this.tires = tires; }

    @Override
    public String toString() {
        return "Repair{" +
                "id=" + id +
                ", servicing=" + servicing +
                ", tires=" + tires +
                '}';
    }
}
