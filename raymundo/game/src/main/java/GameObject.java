public class GameObject implements CollidableDelegate, VisibleDelegate, MovableDelegate{
    CollidableDelegate collidableDelegate;
    VisibleDelegate visibleDelegate;
    MovableDelegate movableDelegate;

    GameObject(VisibleDelegate visibleDelegate, CollidableDelegate collidableDelegate, MovableDelegate movableDelegate) {
        this.visibleDelegate = visibleDelegate;
        this.collidableDelegate = collidableDelegate;
        this.movableDelegate = movableDelegate;
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
