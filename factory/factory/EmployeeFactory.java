package factory;

import domain.Employee;

public class EmployeeFactory {

    public static Employee createEmployee(int id, String name, String competence) {
        return new Employee(id, name, competence);
    }
}
