package org.fundacionjala.prog101.cristianchoque.practice4.game;

public class NotSolid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("splash");
    }
}