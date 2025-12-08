package factory;

import domain.Car;
import domain.Motorbike;
import domain.Vehicle;

public class VehicleFactory {

    public static Vehicle createVehicle(String type, String plate, String brand) {
        if (type == null) {
            return null;
        }

        switch (type.toLowerCase()) {
            case "car" -> {
                // gearbox par défaut
                return new Car(plate, brand, "automatic");
            }

            case "motorbike" -> {
                // modèle / cylindrée par défaut
                return new Motorbike(plate, brand, "Tracer700", 689);
            }

            default -> {
                System.out.println("Unknown vehicle type: " + type);
                return null;
            }
        }
    }
}
