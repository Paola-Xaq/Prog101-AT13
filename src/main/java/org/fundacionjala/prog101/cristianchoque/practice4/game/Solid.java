package org.fundacionjala.prog101.cristianchoque.practice4.game;

public class Solid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("pow");
    }
}