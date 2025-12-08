package fr.efrei.repository;

import fr.efrei.domain.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl instance;
    private List<Employee> employees = new ArrayList<>();

    private EmployeeRepositoryImpl() {}

    public static EmployeeRepositoryImpl getInstance() {
        if (instance == null) instance = new EmployeeRepositoryImpl();
        return instance;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Employee findById(int id) {
        return employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }
}
