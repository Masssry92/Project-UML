package domain;

public class Motorbike extends Vehicle {
    private String modele;
    private int cylindree;

    public Motorbike(String plaque, String marque, String modele, int cylindree) {
        super(plaque, marque);
        this.modele = modele;
        this.cylindree = cylindree;
    }

    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }

    public int getCylindree() { return cylindree; }
    public void setCylindree(int cylindree) { this.cylindree = cylindree; }

    @Override
    public String toString() {
        return "Motorbike{" + super.toString() + ", modele='" + modele + "', cylindree=" + cylindree + "}";
    }
}
