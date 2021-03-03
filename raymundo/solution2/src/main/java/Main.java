public class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(5, 2);
        Figure square = new Square(3);
        Figure triangle = new Triangle(3, 3);
        Figure circle = new Circle(3);
        Figure rhombus = new Rhombus(5, 5);

        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());
        System.out.println(triangle.getArea());
        System.out.println(circle.getArea());
        System.out.println(rhombus.getArea());

        rectangle.draw();
        System.out.println("----------");
        square.draw();
        System.out.println("----------");
        triangle.draw();
        System.out.println("----------");
        rhombus.draw();
        System.out.println("----------");
        circle.draw();
    }
}
