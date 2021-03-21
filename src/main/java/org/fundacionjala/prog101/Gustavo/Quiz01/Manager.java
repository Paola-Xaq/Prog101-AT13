package org.fundacionjala.prog101.Gustavo.Quiz01;

import java.util.ArrayList;

public class Manager extends Employee {
    private static final int MINIMAL_SALARY_MANAGER = 3400;
    private ArrayList<Employee> dependentEmployees;

    Manager(final String nameEmployee, final String lastNameEmployee) {
        super(nameEmployee, lastNameEmployee);
        this.setType("Manager");
        setSalary(MINIMAL_SALARY_MANAGER);
    }

    /**
     * Add Dependent Employees
     *
     * @return void
     */
    void addDependentEmployees(final Employee employee) {
        dependentEmployees.add(employee);
    }

    /**
     * Print List Dependent Employees
     *
     * @return void
     */
    void printListDependentEmployees() {
        for (Employee dependentEmployee : dependentEmployees) {
            System.out.println(dependentEmployee.getName() + " " + dependentEmployee.getLastName());
        }
    }
}
