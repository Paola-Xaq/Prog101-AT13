package org.fundacionjala.prog101.Gustavo.Practice03.Solution01;

public class Circle {
    int radio;

    public Circle(int radius)
    {
        this.radio = radius;
    }
    public  double getArea()
    {
        return Math.PI * Math.pow(radio, 2);
    }
}
