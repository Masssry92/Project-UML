package fr.efrei.factory;

import fr.efrei.domain.Repair;
import fr.efrei.domain.Servicing;
import fr.efrei.domain.Tire;
import java.util.List;

public class RepairFactory {

    public static Repair createRepair(int id, Servicing servicing, List<Tire> tires) {
        return new Repair(id, servicing, tires);
    }
}
