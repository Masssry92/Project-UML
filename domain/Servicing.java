package domain;

public class Servicing {
    private int id;
    private int mileage;
    private String type;

    public Servicing(int id, int mileage, String type) {
        this.id = id;
        this.mileage = mileage;
        this.type = type;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getMileage() { return mileage; }
    public void setMileage(int mileage) { this.mileage = mileage; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return "Servicing{" +
                "id=" + id +
                ", mileage=" + mileage +
                ", type='" + type + '\'' +
                '}';
    }
}
