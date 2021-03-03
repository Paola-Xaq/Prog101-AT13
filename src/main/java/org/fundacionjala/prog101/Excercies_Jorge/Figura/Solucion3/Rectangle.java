package org.fundacionjala.prog101.Excercies_Jorge.Figura.Solucion3;

public class Rectangle extends Figure{
    int base;
    int height;
    PlaneFigure planeFigure;
    Rectangle(int base,int height){
        super("Rectangle");
        this.base=base;
        this.height=height;
        this.planeFigure = new PlaneFigure();
    }

    @Override
    double getArea() {
        return planeFigure.getArea(base,height);
    }

    @Override
    void print() {
        planeFigure.print(base,height);
    }
}
