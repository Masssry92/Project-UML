package factory;

import domain.Garage;

public class GarageFactory {

    public static Garage createGarage(int id, String name) {
        return new Garage(id, name);
    }
}
