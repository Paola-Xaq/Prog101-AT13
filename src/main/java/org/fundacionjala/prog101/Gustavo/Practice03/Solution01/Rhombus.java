package org.fundacionjala.prog101.Gustavo.Practice03.Solution01;

public class Rhombus {
    int wide;
    int high;

    public Rhombus(int high, int wide) {
        this.wide = wide;
        this.high = high;
    }

    public double getArea() {
        return (wide * high) / 2;
    }

    public void drawn() {
        int count = wide - 1;
        for (int k = 1; k <= wide; k++) {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (int i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            System.out.println();
        }
        count = 1;
        for (int k = 1; k <= wide - 1; k++) {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            count++;
            for (int i = 1; i <= 2 * (wide - k) - 1; i++)
                System.out.print("*");
            System.out.println();
        }
    }
}
