package org.fundacionjala.prog101.PaolaAguilar.Polymorpism;

public class MainPoly {
    public static void main(String[] args) {

        System.out.println(" -----------------");
        System.out.println("Static Poly");
        Static poly = new Static();
        poly.print();
        poly.print(5);
        poly.print(5, 6);
        poly.print("Static poly");
        System.out.println(" -----------------");

        System.out.println("Dynamic Poly");
        DynamicSuperClass dynamicPoly = new Dynamic();
        dynamicPoly.printSuperClass();
    }
}
