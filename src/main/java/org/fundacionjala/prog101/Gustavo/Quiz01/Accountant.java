package org.fundacionjala.prog101.Gustavo.Quiz01;

import java.util.ArrayList;

public class Accountant extends Employee {
    private static final int MINIMAL_SALARY_ACCOUNTANT = 3400;

    Accountant(final String nameEmployee, final String lastNameEmployee) {
        super(nameEmployee, lastNameEmployee);
        this.setType("Accountant");
        setSalary(MINIMAL_SALARY_ACCOUNTANT);
    }

    /**
     * print salary every Employees
     *
     * @return void
     */
    void payrollEmployee(final ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getSalary());
        }
    }
}
