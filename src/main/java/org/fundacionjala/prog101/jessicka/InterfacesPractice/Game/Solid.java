package org.fundacionjala.prog101.jessicka.InterfacesPractice.Game;

public class Solid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("Poww - capum");
    }
}
