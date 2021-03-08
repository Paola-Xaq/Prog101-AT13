package org.fundacionjala.prog101.ExercicesJP.solution3;

public class Rombo extends Figura {
    private int diagonalVertical;
    private int diagonalHorizontal;

    public Rombo(int diagonalVertical,int diagonalHorizontal) {
        super("Rombo");
        this.diagonalVertical = diagonalVertical;
        this.diagonalHorizontal = diagonalHorizontal;
    }

    @Override
    public double getArea() {
        return (this.diagonalVertical+ this.diagonalHorizontal)/2;
    }

    @Override
    public void dibujar() {
        System.out.println("    *  ");
        System.out.println("   ***  ");
        System.out.println("  *****  ");
        System.out.println("   ***  ");
        System.out.println("    *  ");
    }
}
