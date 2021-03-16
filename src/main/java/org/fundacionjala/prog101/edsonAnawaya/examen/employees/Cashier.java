package org.fundacionjala.prog101.edsonAnawaya.examen.employees;

public class Cashier implements Employees {
    private String fullName;

    @Override
    public void addFullName(final String newFullName) {
        fullName = newFullName;
    }

    @Override
    public void printPosition() {
        System.out.println("Attended by Cashier : " + this.fullName);

    }
}
