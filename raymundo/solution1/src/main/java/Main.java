public class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(5, 2);
        Figure square = new Square(3);

        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());

        rectangle.draw();
        System.out.println("----------");
        square.draw();
    }
}
