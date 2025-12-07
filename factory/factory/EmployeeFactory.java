package factory;

import domain.Employee;
import domain.Garage;

public class EmployeeFactory {

    public static Employee createEmployee(int id, String name, String competency, Garage garage) {

        Employee employee = new Employee(id, name, competency);

        garage.addEmployee(employee);

        return employee;
    }
}
