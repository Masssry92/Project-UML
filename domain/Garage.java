package domain;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private final int id;
    private final String name;
    private final List<Employee> employees;
    private final List<Customer> customers;
    private final List<Appointment> appointments;

    private Garage(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;

        this.employees = new ArrayList<>(builder.employees);
        this.customers = new ArrayList<>(builder.customers);
        this.appointments = new ArrayList<>(builder.appointments);
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public List<Customer> getCustomers() {
        return new ArrayList<>(customers);
    }

    public List<Appointment> getAppointments() {
        return new ArrayList<>(appointments);
    }

    
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }


    public static class Builder {
        private int id;
        private String name;
        private List<Employee> employees = new ArrayList<>();
        private List<Customer> customers = new ArrayList<>();
        private List<Appointment> appointments = new ArrayList<>();

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmployees(List<Employee> employees) {
            this.employees = employees;
            return this;
        }

        public Builder setCustomers(List<Customer> customers) {
            this.customers = customers;
            return this;
        }

        public Builder setAppointments(List<Appointment> appointments) {
            this.appointments = appointments;
            return this;
        }

        public Garage build() {
            return new Garage(this);
        }
    }

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
