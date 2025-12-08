package fr.efrei.factory;

import fr.efrei.domain.Employee;

public class EmployeeFactory {

    public static Employee createEmployee(int id, String name, String competency) {
        return new Employee(id, name, competency);
    }
}
