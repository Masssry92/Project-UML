package factory;

import domain.*;

public class VehicleFactory {

    public static Vehicle createVehicle(String type, String plaque, String marque) {
        if (type == null) return null;

        switch (type.toLowerCase()) {
            case "car":
                return new Car(plaque, marque, "automatic");
            case "motorbike":
                return new Motorbike(plaque, marque, "sport", 650);
            default:
                System.out.println("Unknown vehicle type: " + type);
                return null;
        }
    }
}
