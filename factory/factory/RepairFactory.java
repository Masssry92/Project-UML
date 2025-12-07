package factory;

import domain.*;
import java.util.List;

public class RepairFactory {

    public static Repair createRepair(
            int id,
            Servicing servicing,
            List<Tire> tires,
            Vehicle vehicle,
            Employee employee,
            Garage garage
    ) {

        Repair repair = new Repair(id, servicing, tires);

        employee.addRepair(repair);
        garage.addRepair(repair);


        return repair;
    }
}
