package org.fundacionjala.prog101.Excercies_Jorge.DiamondInterfaces;

public class Classname implements InterfaceTwo,InterfaceThree{

    @Override
    public void method1() {
//        InterfaceTwo.super.method1();
        InterfaceThree.super.method1();
    }
}
