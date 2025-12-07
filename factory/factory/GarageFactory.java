package factory;

import domain.Garage;

public class GarageFactory {

    public static Garage createGarage(int id, String name) {
        Garage garage = new Garage(id, name);
        return garage;
    }
}
