package factory;

import domain.Repair;
import domain.Servicing;
import domain.Tire;
import java.util.List;

public class RepairFactory {

    public static Repair createRepair(int id, Servicing servicing, List<Tire> tires) {
        return new Repair(id, servicing, tires);
    }
}
