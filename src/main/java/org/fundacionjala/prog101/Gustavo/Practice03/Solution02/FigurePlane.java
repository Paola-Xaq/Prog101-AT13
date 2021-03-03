package org.fundacionjala.prog101.Gustavo.Practice03.Solution02;

public class FigurePlane extends Figure{
    private int high;
    private int base;
    FigurePlane(int high, int base){
        this.high=high;
        this.base=base;
    }
    public double getArea(){
        return high*base;
    }

    public void drawn(){
        for (int i = 0; i < high; i++)
        {
            for (int j = 0; j < base; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
