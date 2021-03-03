package org.fundacionjala.prog101.Excercies_Jorge.Figura.Solucion1;

public class Rectangle extends Figure{
    int base;
    int height;
    Rectangle(int base,int height){
        super("Rectangle");
        this.base=base;
        this.height=height;
    }

    @Override
    double getArea() {
        return base * height;
    }

    @Override
    void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
