package org.fundacionjala.prog101.ExercicesJP.composision;

public class GameObject implements VisibleDelegate,MovableDelegate,CollidableDelegate {
    VisibleDelegate visibleDelegate;
    MovableDelegate movableDelegate;
    CollidableDelegate collidableDelegate;

    public GameObject(VisibleDelegate visibleDelegate, MovableDelegate movableDelegate, CollidableDelegate collidableDelegate) {
        this.visibleDelegate = visibleDelegate;
        this.movableDelegate = movableDelegate;
        this.collidableDelegate = collidableDelegate;
    }

    @Override
    public void collide() {
        collidableDelegate.collide();
    }

    @Override
    public void move() {
        movableDelegate.move();
    }

    @Override
    public void draw() {
        visibleDelegate.draw();
    }
}
