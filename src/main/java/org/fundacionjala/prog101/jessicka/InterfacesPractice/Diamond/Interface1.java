package org.fundacionjala.prog101.jessicka.InterfacesPractice.Diamond;

public interface Interface1 {
    default  void method1(String classname) {
        System.out.println("This is Interface1" + classname);
    }
}
