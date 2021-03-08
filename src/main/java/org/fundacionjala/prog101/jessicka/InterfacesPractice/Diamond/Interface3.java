package org.fundacionjala.prog101.jessicka.InterfacesPractice.Diamond;

public interface Interface3 extends Interface1{
    @Override
    default void method1(String classname) {
        System.out.println("This is Interface3 " + classname);
    }
}
