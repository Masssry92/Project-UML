package domain;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private int id;
    private String name;
    private List<Employee> employees;
    private List<Customer> customers;
    private List<Appointment> appointments;

    public Garage(int id, String name) {
        this.id = id;
        this.name = name;
        this.employees = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public List<Employee> getEmployees() { return employees; }
    public List<Customer> getCustomers() { return customers; }
    public List<Appointment> getAppointments() { return appointments; }

    public void addEmployee(Employee e) { employees.add(e); }
    public void addCustomer(Customer c) { customers.add(c); }
    public void addAppointment(Appointment a) { appointments.add(a); }

    @Override
    public String toString() {
        return "Garage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employees=" + employees.size() +
                ", customers=" + customers.size() +
                ", appointments=" + appointments.size() +
                '}';
    }
}
