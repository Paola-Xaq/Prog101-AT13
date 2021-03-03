package org.fundacionjala.prog101.Gustavo.Practice03.Solution01;

public class Circle extends Figure {
    int radio;

    public Circle(int radius) {
        this.radio = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public void drawn() {
        int diameter = 2 * radio;
        String[][] cir = new String[diameter + 1][diameter + 1];
        for (int y = 0; y < diameter + 1; y++) {
            for (int x = 0; x < diameter + 1; x++) {
                int xV = x - radio;
                int yV = y - radio;
                if ((xV * xV + yV * yV) > (radio - 0.5) * (radio - 0.5) && (xV * xV + yV * yV) < (radio + 0.5) * (radio + 0.5)) {
                    cir[y][x] = "*";
                } else {
                    cir[y][x] = "_";
                }
            }
        }

        for (int y = 0; y < diameter + 1; y++) {
            for (int x = 0; x < diameter + 1; x++) {
                System.out.print(cir[y][x]);

            }
            System.out.println();
        }
    }
}
