package org.fundacionjala.prog101.edsonAnawaya.practice4.diamondInterfaces;

public interface Interface1 {
    default String method1(String field) {
        return "Inteface1's method1 : "+field;
    }
}
