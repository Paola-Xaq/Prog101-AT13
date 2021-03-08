public class NotSolid implements CollidableDelegate{
    @Override
    public void collide() {
        System.out.println("Do not collide");
    }
}
