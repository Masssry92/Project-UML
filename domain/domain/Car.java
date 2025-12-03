package domain;

public class Car extends Vehicle {
    private String boite;

    public Car(String plaque, String marque, String boite) {
        super(plaque, marque);
        this.boite = boite;
    }

    public String getBoite() { return boite; }
    public void setBoite(String boite) { this.boite = boite; }

    @Override
    public String toString() {
        return "Car{" + super.toString() + ", boite='" + boite + "'}";
    }
}
