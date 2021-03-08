package org.fundacionjala.prog101.DanielaSC.Interface;

public class Dove implements Bird{
    @Override
    public void fly() {
        System.out.println("the dove is flying");
    }

    @Override
    public void eat() {
        System.out.println("Ñam ñam");
    }
}
