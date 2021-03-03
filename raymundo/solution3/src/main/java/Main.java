import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(5, 2);
        Figure square = new Square(3);
        Figure triangle = new Triangle(3, 3);
        Figure circle = new Circle(3);
        Figure rhombus = new Rhombus(5, 5);

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(rectangle);
        figures.add(square);
        figures.add(triangle);
        figures.add(circle);
        figures.add(rhombus);

        for (Figure figure : figures) {
            System.out.println(figure.getArea());
            figure.draw();
            System.out.println(figure);
            System.out.println("----------");
        }
    }
}
