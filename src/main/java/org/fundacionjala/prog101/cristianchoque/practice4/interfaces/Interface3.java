package org.fundacionjala.prog101.cristianchoque.practice4.interfaces;

public interface Interface3 extends Interface1{
    @Override
    default String method1(String field) {
        return "Method Inteface3 : "+field;
    }
}