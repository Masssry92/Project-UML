package factory;

import domain.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n=========== GARAGE MANAGEMENT SYSTEM ==========\n");


        // 1) CREATE GARAGE

        Garage garage = GarageFactory.createGarage(1, "EFREI Garage");


        // 2) CREATE EMPLOYEES

        Employee emp1 = EmployeeFactory.createEmployee(1, "Alex", "Mechanic", garage);
        Employee emp2 = EmployeeFactory.createEmployee(2, "Sarah", "Engine Specialist", garage);


        // 3) CREATE VEHICLES

        Vehicle car1 = VehicleFactory.createVehicle("car", "AA-123-BB", "Peugeot");
        Vehicle car2 = VehicleFactory.createVehicle("car", "CC-987-DD", "Renault");
        Vehicle moto1 = VehicleFactory.createVehicle("motorbike", "ZZ-456-YY", "Yamaha");

    
        // 4) CREATE CUSTOMERS
      
        Customer c1 = new Customer(1, "John Doe", car1);
        c1.addVehicle(moto1);

        Customer c2 = new Customer(2, "Alice Martin", car2);

        garage.addCustomer(c1);
        garage.addCustomer(c2);

 
        // 5) CREATE APPOINTMENTS
        
        Appointment ap1 = AppointmentFactory.createAppointment(
                10,
                new Date(),
                "Oil change",
                c1,
                garage
        );

        Appointment ap2 = AppointmentFactory.createAppointment(
                11,
                new Date(),
                "Brake inspection",
                c2,
                garage
        );

        
        // 6) CREATE SERVICING + TIRES

        Servicing servicingA = new Servicing(1, 15000, "full");
        Servicing servicingB = new Servicing(2, 8000, "partial");

        Tire t1 = new Tire(1, "winter", 1);
        Tire t2 = new Tire(2, "winter", 2);
        Tire t3 = new Tire(3, "summer", 1);
        Tire t4 = new Tire(4, "summer", 2);

        List<Tire> tiresA = Arrays.asList(t1, t2);
        List<Tire> tiresB = Arrays.asList(t3, t4);


        // 7) CREATE REPAIRS

        Repair r1 = RepairFactory.createRepair(
                100,
                servicingA,
                tiresA,
                car1,
                emp1,
                garage
        );

        Repair r2 = RepairFactory.createRepair(
                101,
                servicingB,
                tiresB,
                moto1,
                emp2,
                garage
        );


        // 8) DISPLAY SYSTEM STATE

        System.out.println("\n=========== SYSTEM OVERVIEW ===========");
        System.out.println(garage);
        System.out.println("Customers: " + garage.getCustomers().size());
        System.out.println("Employees: " + garage.getEmployees().size());
        System.out.println("Appointments: " + garage.getAppointments().size());
        System.out.println("Repairs: " + garage.getRepairs().size());

        System.out.println("\n--- Details ---");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(ap1);
        System.out.println(ap2);
        System.out.println(r1);
        System.out.println(r2);


    }
}

