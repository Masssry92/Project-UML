package fr.efrei.repository;

import fr.efrei.domain.Employee;
import java.util.List;

public interface EmployeeRepository {
    void add(Employee employee);
    Employee findById(int id);
    List<Employee> findAll();
}
