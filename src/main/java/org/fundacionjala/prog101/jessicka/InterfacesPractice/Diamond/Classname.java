package org.fundacionjala.prog101.jessicka.InterfacesPractice.Diamond;

public class Classname implements Interface2, Interface3{
    String classname;

    @Override
    public void method1(String classname) {
        this.classname = classname;
        Interface2.super.method1(classname);
        Interface3.super.method1(classname);
    }

}
