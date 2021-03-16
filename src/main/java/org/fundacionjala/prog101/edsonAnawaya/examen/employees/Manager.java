package org.fundacionjala.prog101.edsonAnawaya.examen.employees;

public class Manager implements Employees {
    private String fullName;

    @Override
    public void addFullName(final String newFullName) {
        this.fullName = newFullName;
    }

    @Override
    public void printPosition() {
        System.out.println("Attended by Manager : " + this.fullName);
    }

}
