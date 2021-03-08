package org.fundacionjala.prog101.Excercies_Jorge.Figura.Solucion2;

public class Triangle extends Figure{
    int base;
    int height;
    Triangle(int base,int height){
        super("Rectangle");
        this.base=base;
        this.height=height;
    }
    @Override
    double getArea() {
        return (base*height)/2;
    }
    @Override
    void print() {
        System.out.println("  *  ");
        System.out.println(" ***  ");
        System.out.println("*****");
    }
}
