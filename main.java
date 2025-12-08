package fr.efrei;

import fr.efrei.domain.*;
import fr.efrei.factory.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import fr.efrei.repository.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static Garage garage;
    private static int nextCustomerId = 1;
    private static int nextEmployeeId = 1;
    private static int nextAppointmentId = 1;
    private static int nextRepairId = 1;
    private static int nextServicingId = 1;
    private static int nextTireId = 1;

    private static final CustomerRepository customerRepo = CustomerRepositoryImpl.getInstance();
    private static final EmployeeRepository employeeRepo = EmployeeRepositoryImpl.getInstance();
    private static final VehicleRepository vehicleRepo = VehicleRepositoryImpl.getInstance();
    private static final AppointmentRepository appointmentRepo = AppointmentRepositoryImpl.getInstance();
    private static final RepairRepository repairRepo = RepairRepositoryImpl.getInstance();
    private static final GarageRepository garageRepo = GarageRepositoryImpl.getInstance();

    public static void main(String[] args) {
        System.out.println("== EFREI Garage system starting ==");

        garage = GarageFactory.createGarage(1, "EFREI Garage");
        garageRepo.add(garage);

        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("Your choice: ");
            switch (choice) {
                case 1 -> createEmployee();
                case 2 -> createCustomerWithVehicle();
                case 3 -> createAppointment();
                case 4 -> createRepair();
                case 5 -> listCustomers();
                case 6 -> listVehicles();
                case 7 -> listAppointments();
                case 8 -> listRepairs();
                case 9 -> listEmployees();
                case 0 -> running = false;
                default -> System.out.println("Invalid choice.");
            }
        }

        System.out.println("Goodbye.");
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("===== GARAGE MANAGEMENT SYSTEM =====");
        System.out.println("1. Add employee");
        System.out.println("2. Add customer with vehicle");
        System.out.println("3. Create appointment");
        System.out.println("4. Create repair");
        System.out.println("5. List customers");
        System.out.println("6. List vehicles");
        System.out.println("7. List appointments");
        System.out.println("8. List repairs");
        System.out.println("9. List employees");
        System.out.println("0. Exit");
    }

    private static void createEmployee() {
        String name = readLine("Employee name: ");
        String competency = readLine("Competency: ");

        Employee employee = EmployeeFactory.createEmployee(nextEmployeeId++, name, competency);
        employeeRepo.add(employee);
        garage.addEmployee(employee);

        System.out.println("Employee created: " + employee);
    }

    private static void createCustomerWithVehicle() {
        String customerName = readLine("Customer name: ");

        String type;
        while (true) {
            type = readLine("Vehicle type (car/motorbike): ").toLowerCase();
            if (type.equals("car") || type.equals("motorbike")) break;
            System.out.println("Type must be 'car' or 'motorbike'.");
        }

        String plate = readLine("Vehicle plate: ");
        String brand = readLine("Vehicle brand: ");

        Vehicle vehicle = VehicleFactory.createVehicle(type, plate, brand);
        if (vehicle == null) {
            System.out.println("Vehicle creation failed.");
            return;
        }
        vehicleRepo.add(vehicle);

        Customer customer = new Customer(nextCustomerId++, customerName, vehicle);
        customerRepo.add(customer);
        garage.addCustomer(customer);

        System.out.println("Customer created: " + customer);
        System.out.println("Vehicle created: " + vehicle);
    }

    private static void createAppointment() {
        if (customerRepo.findAll().isEmpty()) {
            System.out.println("No customers. Create a customer first.");
            return;
        }

        System.out.println("Existing customers:");
        for (Customer c : customerRepo.findAll()) {
            System.out.println("  [" + c.getId() + "] " + c.getName());
        }

        int customerId = readInt("Customer id: ");
        Customer customer = customerRepo.findById(customerId);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        Date date = readDate("Appointment date (yyyy-MM-dd): ");
        String reason = readLine("Reason: ");

        Appointment appointment = AppointmentFactory.createAppointment(nextAppointmentId++, date, reason);
        appointmentRepo.add(appointment);
        garage.addAppointment(appointment);

        System.out.println("Appointment created: " + appointment);
    }

    private static void createRepair() {
        if (vehicleRepo.findAll().isEmpty()) {
            System.out.println("No vehicles. Create a customer with a vehicle first.");
            return;
        }
        if (employeeRepo.findAll().isEmpty()) {
            System.out.println("No employees. Create an employee first.");
            return;
        }

        System.out.println("Vehicles:");
        for (Vehicle v : vehicleRepo.findAll()) {
            System.out.println("  " + v.getPlate() + " - " + v.getBrand());
        }
        String plate = readLine("Plate of vehicle to repair: ");
        Vehicle vehicle = vehicleRepo.findByPlate(plate);
        if (vehicle == null) {
            System.out.println("Vehicle not found.");
            return;
        }

        System.out.println("Employees:");
        for (Employee e : employeeRepo.findAll()) {
            System.out.println("  [" + e.getId() + "] " + e.getName() + " (" + e.getCompetency() + ")");
        }
        int employeeId = readInt("Employee id: ");
        Employee employee = employeeRepo.findById(employeeId);
        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }

        String repairType;
        while (true) {
            repairType = readLine("Type of repair (servicing/tires): ").toLowerCase();
            if (repairType.equals("servicing") || repairType.equals("tires")) break;
            System.out.println("Type must be 'servicing' or 'tires'.");
        }

        Servicing servicing = null;
        List<Tire> tires = new ArrayList<>();

        if (repairType.equals("servicing")) {
            int mileage = readInt("Current mileage: ");
            String type = readLine("Servicing type (Full/Basic/...): ");
            servicing = new Servicing(nextServicingId++, mileage, type);
        } else {
            int count = readInt("Number of tires to replace: ");
            for (int i = 0; i < count; i++) {
                String tType = readLine("Tire type (e.g. winter/summer) for tire " + (i + 1) + ": ");
                int wheel = readInt("Wheel position (1-4) for tire " + (i + 1) + ": ");
                tires.add(new Tire(nextTireId++, tType, wheel));
            }
        }

        Repair repair = RepairFactory.createRepair(nextRepairId++, servicing, tires);
        repairRepo.add(repair);

        System.out.println("Repair created for vehicle " + vehicle.getPlate() + " handled by " + employee.getName());
        System.out.println(repair);
    }

    private static void listCustomers() {
        List<Customer> customers = customerRepo.findAll();
        if (customers.isEmpty()) {
            System.out.println("No customers.");
            return;
        }
        System.out.println("=== Customers ===");
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    private static void listVehicles() {
        List<Vehicle> vehicles = vehicleRepo.findAll();
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles.");
            return;
        }
        System.out.println("=== Vehicles ===");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    private static void listAppointments() {
        List<Appointment> appointments = appointmentRepo.findAll();
        if (appointments.isEmpty()) {
            System.out.println("No appointments.");
            return;
        }
        System.out.println("=== Appointments ===");
        for (Appointment a : appointments) {
            System.out.println(a);
        }
    }

    private static void listRepairs() {
        List<Repair> repairs = repairRepo.findAll();
        if (repairs.isEmpty()) {
            System.out.println("No repairs.");
            return;
        }
        System.out.println("=== Repairs ===");
        for (Repair r : repairs) {
            System.out.println(r);
        }
    }

    private static void listEmployees() {
        List<Employee> employees = employeeRepo.findAll();
        if (employees.isEmpty()) {
            System.out.println("No employees.");
            return;
        }
        System.out.println("=== Employees ===");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    private static int readInt(String label) {
        while (true) {
            System.out.print(label);
            String line = scanner.nextLine();
            try {
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    private static String readLine(String label) {
        System.out.print(label);
        return scanner.nextLine().trim();
    }

    private static Date readDate(String label) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        while (true) {
            System.out.print(label);
            String line = scanner.nextLine().trim();
            try {
                return sdf.parse(line);
            } catch (ParseException e) {
                System.out.println("Invalid format. Use yyyy-MM-dd.");
            }
        }
    }
}
