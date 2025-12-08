package fr.efrei.factory;

import fr.efrei.domain.Garage;

public class GarageFactory {

    public static Garage createGarage(int id, String name) {
        Garage garage = new Garage(id, name);
        return garage;
    }
}
