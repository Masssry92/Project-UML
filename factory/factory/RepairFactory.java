package factory;

import domain.*;
import java.util.List;

public class RepairFactory {

    public static Repair createRepair(int id, Revision revision, List<Tire> tires) {
        return new Repair(id, revision, tires);
    }
}
