package factory;

import domain.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Vehicle car = VehicleFactory.createVehicle("car", "AA-123-BB", "Peugeot");
        Vehicle moto = VehicleFactory.createVehicle("motorbike", "ZZ-456-YY", "Yamaha");

        System.out.println(car);
        System.out.println(moto);

        Employee emp = EmployeeFactory.createEmployee(1, "Alex", "Mechanic");
        System.out.println(emp);

        Garage garage = GarageFactory.createGarage(1, "EFREI Garage");
        garage.addEmployee(emp);
        System.out.println(garage);

        Appointment app = AppointmentFactory.createAppointment(1, new Date(), "Oil change");
        System.out.println(app);

        Revision rev = new Revision(1, 12000, "full");
        Tire tire1 = new Tire(1, "winter", 1);
        Tire tire2 = new Tire(2, "winter", 2);
        List<Tire> tires = Arrays.asList(tire1, tire2);

        Repair repair = RepairFactory.createRepair(1, rev, tires);
        System.out.println(repair);
    }
}
