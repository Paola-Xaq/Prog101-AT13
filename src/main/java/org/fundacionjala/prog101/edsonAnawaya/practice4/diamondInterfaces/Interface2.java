package org.fundacionjala.prog101.edsonAnawaya.practice4.diamondInterfaces;

public interface Interface2 extends Interface1{
    @Override
    default String method1(String field) {
        return "Inteface2's method1 : "+field;
    }
}