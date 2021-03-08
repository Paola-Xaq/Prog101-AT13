package org.fundacionjala.prog101.jessicka.InterfacesPractice.Game;

public class NotSolid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("Splash");
    }
}
