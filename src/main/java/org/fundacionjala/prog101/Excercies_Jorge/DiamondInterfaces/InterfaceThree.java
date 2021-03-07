package org.fundacionjala.prog101.Excercies_Jorge.DiamondInterfaces;

public interface InterfaceThree extends InterfaceOne{
    default void method1(){
        System.out.println("Soy la interface 3 :V");
    }
}
