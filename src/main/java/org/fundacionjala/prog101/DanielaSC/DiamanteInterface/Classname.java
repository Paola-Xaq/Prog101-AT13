package org.fundacionjala.prog101.DanielaSC.DiamanteInterface;

public class Classname implements Interface2, Interface3{
    String name;
    @Override
    public String method1(String name) {
        
        this.name = name;
        return Interface2.super.method1(name) + " " + Interface3.super.method1(name);
    }
}
