public class NotMovable implements MovableDelegate{
    @Override
    public void move() {
        System.out.println("Do not move");
    }
}
