package org.fundacionjala.prog101.PaolaAguilar.Game;

public class NotSolid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("Splash");
    }
}
