package org.fundacionjala.prog101.joelrojas.game;

public class GameObject implements VisibleDelegate, MovableDelegate, CollidableDelegate{
    VisibleDelegate visibleDelegate;
    MovableDelegate movableDelegate;
    CollidableDelegate collidableDelegate;

    public GameObject(VisibleDelegate v, MovableDelegate m, CollidableDelegate c) {
        visibleDelegate = v;
        movableDelegate = m;
        collidableDelegate = c;
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
