package org.fundacionjala.prog101.Gustavo.Quiz01;

public class Employee {
    private String name;
    private String lastName;
    private String type;
    private int salary;
    private static final int MINIMAL_SALARY = 1200;

    Employee(final String nameEmployee, final String lastNameEmployee) {
        this.name = nameEmployee;
        this.lastName = lastNameEmployee;
        this.setType("Employee");
        this.salary = MINIMAL_SALARY;
    }

    /**
     * @return a name
     */
    public String getName() {
        return name;
    }

    /**
     * @return a last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return a type
     */
    public String getType() {
        return type;
    }

    /**
     * @return set type
     */
    public void setType(final String typeEmployee) {
        this.type = typeEmployee;
    }

    /**
     * @return a salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * set salary
     *
     * @return
     */
    public void setSalary(final int salaryEmployee) {
        this.salary = salaryEmployee;
    }
}
