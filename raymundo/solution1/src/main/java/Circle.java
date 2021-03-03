public class Circle extends Figure{
    int radius;

    Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("    *  *");
        System.out.println(" *        *");
        System.out.println("*          *");
        System.out.println("*          *");
        System.out.println(" *        *");
        System.out.println("    *  *");
    }
}
