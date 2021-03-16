package org.fundacionjala.prog101.Excercies_Jorge.DiamondInterfaces;

public interface InterfaceTwo extends InterfaceOne {
    default void method1(){
        System.out.println("Soy la interface 2 :V");
    }

}
