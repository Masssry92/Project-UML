package domain;

public abstract class Vehicle {
    private String plaque;
    private String marque;

    public Vehicle(String plaque, String marque) {
        this.plaque = plaque;
        this.marque = marque;
    }

    public String getPlaque() { return plaque; }
    public void setPlaque(String plaque) { this.plaque = plaque; }

    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plaque='" + plaque + '\'' +
                ", marque='" + marque + '\'' +
                '}';
    }
}
