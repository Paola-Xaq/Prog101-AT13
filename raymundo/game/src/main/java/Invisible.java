public class Invisible implements VisibleDelegate{
    @Override
    public void draw() {
        System.out.println("Do not draw");
    }
}
