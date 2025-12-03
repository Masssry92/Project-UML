package domain;

public class Tire {
    private int id;
    private String type;
    private int roue;

    public Tire(int id, String type, int roue) {
        this.id = id;
        this.type = type;
        this.roue = roue;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getRoue() { return roue; }
    public void setRoue(int roue) { this.roue = roue; }

    @Override
    public String toString() {
        return "Tire{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", roue=" + roue +
                '}';
    }
}
