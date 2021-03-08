public class Movable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("Move");
    }
}
