package org.fundacionjala.prog101.joelrojas.game;

public class GameObject implements VisibleDelegate, MovableDelegate, CollidableDelegate{
    private VisibleDelegate visible;
    private MovableDelegate movable;
    public CollidableDelegate collidable;

    public GameObject(VisibleDelegate v, MovableDelegate m, CollidableDelegate c) {
        visible = v;
        movable = m;
        collidable = c;
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
