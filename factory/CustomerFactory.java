package fr.efrei.factory;

import fr.efrei.domain.Customer;
import fr.efrei.domain.Vehicle;
import fr.efrei.domain.Garage;

public class CustomerFactory {

    public static Customer createCustomer(int id, String name, Vehicle vehicle, Garage garage) {
        Customer customer = new Customer(id, name, vehicle);
        garage.addCustomer(customer);
        return customer;
    }
}
