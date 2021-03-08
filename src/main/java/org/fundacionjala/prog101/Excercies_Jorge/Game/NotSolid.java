package org.fundacionjala.prog101.Excercies_Jorge.Game;

public class NotSolid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("Collides in silence fuuuuu");
    }
}
