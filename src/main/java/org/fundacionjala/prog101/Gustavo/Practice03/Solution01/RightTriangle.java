package org.fundacionjala.prog101.Gustavo.Practice03.Solution01;

public class RightTriangle extends Figure {
    int wide;
    int high;
    public RightTriangle(int high, int wide)
    {
        this.wide = wide;
        this.high = high;
    }
    public double getArea()
    {
        return (wide * high) / 2;
    }
    public void drawn()
    {
        for (int i = 0; i <= high; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
