package org.fundacionjala.prog101.DanielaSC.DiamanteInterface;

public interface Interface3 extends Interface1{
    @Override
    default String method1(String name) {
        
        String salute = "Hello from interface 3, " + name; 
        return Interface1.super.method1(salute);
    }
}
