package org.fundacionjala.prog101.Excercies_Jorge.Figura.Solucion2;

public class Rectangle extends PlaneFigure{
    int base;
    int height;
    Rectangle(int base,int height){
        super("Rectangle");
        this.base=base;
        this.height=height;
    }

    @Override
    double getArea() {
        return super.getArea(base,height);
    }

    @Override
    void print() {
        super.print(base,height);
    }
}
