package fr.efrei.repository;

import fr.efrei.domain.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static CustomerRepositoryImpl instance;
    private List<Customer> customers = new ArrayList<>();

    private CustomerRepositoryImpl() {}

    public static CustomerRepositoryImpl getInstance() {
        if (instance == null) instance = new CustomerRepositoryImpl();
        return instance;
    }

    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
