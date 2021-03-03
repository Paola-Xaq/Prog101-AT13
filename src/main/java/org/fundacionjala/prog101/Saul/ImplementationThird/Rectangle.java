package org.fundacionjala.prog101.Saul.ImplementationThird;

public class Rectangle extends Figure {
    private int height;
    private int base;
    private FlatFigure flatFigure;
    public Rectangle(int base, int height) {
        type = "Rectangle";
        this.height = height;
        this.base = base;
        flatFigure = new FlatFigure();
    }
    public double getArea() {
        return flatFigure.getArea(base, height);
    }
    public void draw() {
        flatFigure.draw(base, height);
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "type='" + type + '\'' +
                '}';
    }
}
