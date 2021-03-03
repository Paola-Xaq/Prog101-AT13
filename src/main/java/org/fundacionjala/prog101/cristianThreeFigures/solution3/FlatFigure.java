package org.fundacionjala.prog101.cristianThreeFigures.solution3;

public class FlatFigure {

    public double getArea(int a , int b) {
        return a * b;
    }

    public double getArea(int a ) {
        return a * a;
    }

    public void print(int a , int b) {
        for (int i = 0; i < b ; i++) {
            for (int j = 0; j < a ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void print(int a) {
        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < a ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
