package org.fundacionjala.prog101.Saul.ImplementationSecond;

public class Rectangle extends FlatFigure {
    private int height;
    private int base;
    public Rectangle(int base, int height) {
        type = "Rectangle";
        this.height = height;
        this.base = base;
    }
    public void draw() {
        super.draw(base, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "type='" + type + '\'' +
                '}';
    }
}
