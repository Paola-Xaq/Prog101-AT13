package org.fundacionjala.prog101.DanielaSC.Interface;

public class Parrot implements Bird{
    @Override
    public void fly() {
        System.out.println("the parrot is flying");
    }

    @Override
    public void eat() {
        System.out.println("Ñam ñam ñam");
    }
}
