package org.fundacionjala.prog101.Excercies_Jorge.Figura.Solucion2;

public class Figure {
    String type;
    Figure(String type){
        this.type=type;
    }
    double getArea(){
        return -1;
    }
     void print(){
         System.out.println("----------");
     }

    @Override
    public String toString() {
        return "Figure{" +
                "type='" + type + '\'' +
                '}';
    }
}
