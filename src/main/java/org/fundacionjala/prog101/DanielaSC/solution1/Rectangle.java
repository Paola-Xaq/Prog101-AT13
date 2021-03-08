package org.fundacionjala.prog101.DanielaSC.solution1;

public class Rectangle extends Figure{
    int height;
    int base;
    public Rectangle(int height, int base) {
        super("Rectangle");
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base; j++) {
                System.out.println("*");
            }
        }
    }
}
