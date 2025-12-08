package factory;

import domain.Customer;
import domain.Vehicle;
import domain.Garage;

public class CustomerFactory {

    public static Customer createCustomer(int id, String name, Vehicle vehicle, Garage garage) {
        Customer customer = new Customer(id, name, vehicle);
        garage.addCustomer(customer);
        return customer;
    }
}
