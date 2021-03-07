package org.fundacionjala.prog101.Gustavo.Practice04.composition;

public class Solid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("Poiwwww -  capum");
    }
}
