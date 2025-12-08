package fr.efrei.repository;

import fr.efrei.domain.Customer;
import java.util.List;

public interface CustomerRepository {
    void add(Customer customer);
    Customer findById(int id);
    List<Customer> findAll();
}
