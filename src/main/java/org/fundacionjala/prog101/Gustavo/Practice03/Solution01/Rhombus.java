package org.fundacionjala.prog101.Gustavo.Practice03.Solution01;

public class Rhombus {
    int wide;
    int high;
    public Rhombus(int high, int wide)
    {
        this.wide = wide;
        this.high = high;
    }
    public double getArea()
    {
        return (wide * high) / 2;
    }
}
