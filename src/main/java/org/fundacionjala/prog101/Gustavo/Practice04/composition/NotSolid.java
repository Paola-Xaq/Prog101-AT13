package org.fundacionjala.prog101.Gustavo.Practice04.composition;

public class NotSolid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("Splash");
    }
}
