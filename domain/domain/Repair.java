package domain;

import java.util.List;

public class Repair {
    private int id;
    private Revision revision;
    private List<Tire> tires;

    public Repair(int id, Revision revision, List<Tire> tires) {
        this.id = id;
        this.revision = revision;
        this.tires = tires;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Revision getRevision() { return revision; }
    public void setRevision(Revision revision) { this.revision = revision; }

    public List<Tire> getTires() { return tires; }
    public void setTires(List<Tire> tires) { this.tires = tires; }

    @Override
    public String toString() {
        return "Repair{" +
                "id=" + id +
                ", revision=" + revision +
                ", tires=" + tires +
                '}';
    }
}
