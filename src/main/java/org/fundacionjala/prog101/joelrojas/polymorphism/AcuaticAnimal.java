package org.fundacionjala.prog101.joelrojas.polymorphism;

public class AcuaticAnimal extends Animal{
    private int fins;

    public AcuaticAnimal(int age , int fins) {
        super(age);
        this.fins = fins;
    }

    public AcuaticAnimal() {
        super(0);
        this.fins = 2;
    }

    public void move() {
        System.out.println("move swimming");
    }

    public void breath() {
        System.out.println("Do it under sea");
    }
}
