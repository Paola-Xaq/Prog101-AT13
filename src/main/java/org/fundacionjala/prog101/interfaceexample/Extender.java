package org.fundacionjala.prog101.interfaceexample;

interface A{
    void metodo1();
    void metodo2();
}
interface B extends A{
    void metodo3();
}

class MiClase implements B{
    public void metodo1() {
        System.out.println("Implementación de metodo1().");
    }
    public void metodo2() {
        System.out.println("Implementación de metodo2().");
    }
    public void metodo3() {
        System.out.println("Implementación de metodo3().");
    }
}
public class Extender {
    public static void main(String[] args) {
        MiClase mc=new MiClase();
        mc.metodo1();
        mc.metodo2();
        mc.metodo3();
    }
}

