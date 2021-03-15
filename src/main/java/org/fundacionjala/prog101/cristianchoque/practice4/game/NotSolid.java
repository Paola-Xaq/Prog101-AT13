package org.fundacionjala.prog101.cristianchoque.practice4.game;

public class NotSolid implements CollidableDelegate {
    /**
     * @param
     */
    @Override
    public void collide() {
        System.out.println("splash");
    }
}
