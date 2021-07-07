package org.fundacionjala.prog101.cristianchoque.practice4.game;

public class GameObject implements VisibleDelegate, MovableDelegate, CollidableDelegate {
    VisibleDelegate visible;
    MovableDelegate movable;
    CollidableDelegate collidable;

    GameObject(VisibleDelegate visibleDelegate, MovableDelegate movableDelegate, CollidableDelegate collidableDelegate) {
        visible = visibleDelegate;
        movable = movableDelegate;
        collidable = collidableDelegate;
    }

    @Override
    public void collide() {
        collidable.collide();
    }

    @Override
    public void move() {
        movable.move();
    }

    @Override
    public void draw() {
        visible.draw();
    }
}