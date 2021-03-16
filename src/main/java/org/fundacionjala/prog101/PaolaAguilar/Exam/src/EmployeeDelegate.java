package org.fundacionjala.prog101.PaolaAguilar.Exam.src;

public abstract class EmployeeDelegate {
    private String name;
    private String type;
    private String cargo;

    public EmployeeDelegate(String name, String type) {
        this.type = type;
        this.name = name;
    }
}
