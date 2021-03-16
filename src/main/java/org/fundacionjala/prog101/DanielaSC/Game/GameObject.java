package org.fundacionjala.prog101.DanielaSC.Game;

public class GameObject {
    private VisibleDelegate visible;
    private CollidableDelegate collidable;
    public MovableDelegate movable;

    public GameObject(VisibleDelegate visible, CollidableDelegate collidable, MovableDelegate movable) {
        this.visible = visible;
        this.collidable = collidable;
        this.movable = movable;
    }

    public void collide() {
        collidable.collide();
    }

    public void draw() {
        visible.draw();
    }

    public void move() {
        movable.move();
    }
}
