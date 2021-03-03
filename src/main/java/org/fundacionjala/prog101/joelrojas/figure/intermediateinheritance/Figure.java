package org.fundacionjala.prog101.joelrojas.figure.intermediateinheritance;

public abstract class Figure {
    String type;
    public Figure(String type) {
        this.type = type;
    }

    public abstract double getArea();

    public abstract void print();

    public String getType() {
        return this.type;
    }
}
