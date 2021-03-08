package org.fundacionjala.prog101.PaolaAguilar.InterfaceProblem;

public class Classname implements Interface2, Interface3{

    public String method1(){
        return Interface2.super.method1() + "\n"
                + Interface3.super.method1();
    }
}
