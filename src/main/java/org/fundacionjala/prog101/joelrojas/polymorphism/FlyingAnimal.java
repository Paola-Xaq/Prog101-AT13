package org.fundacionjala.prog101.joelrojas.polymorphism;

public class FlyingAnimal extends Animal{

    public FlyingAnimal(int age) {
        super(age);
    }
    
    public void move() {
        System.out.println("move flying");
    }

    public void breath() {
        System.out.println("Do it in the open air");
    }
}
