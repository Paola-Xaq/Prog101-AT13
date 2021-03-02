package org.fundacionjala.prog101.joelrojas.polymorphism;

public abstract class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public void getOlder() {
        this.age += 1;
    }

    public abstract void move();

    public abstract void breath();

}
