package org.fundacionjala.prog101.DanielaSC.DiamanteInterface;

public interface Interface1 {
    default String method1(String name) {
        return "Welcome " + name + " ";
    }
}
