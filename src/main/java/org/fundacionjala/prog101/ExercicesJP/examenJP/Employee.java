package org.fundacionjala.prog101.ExercicesJP.examenJP;

public class Employee {

    private int ci;
    private String name;
    private TypeEmployee typeEmployee;

    public Employee(int ci,String nombre, TypeEmployee typeEmployee) {
        this.ci = ci;
        this.name = nombre;
        this.typeEmployee = typeEmployee;
    }

    public int getCi() {
        return ci;
    }

    public String getName() {
        return name;
    }

    public TypeEmployee getTypeEmployee() {
        return typeEmployee;
    }

    @Override
    public String toString() {
        return "Ci= " + ci+" Name= " + name;
    }

}
