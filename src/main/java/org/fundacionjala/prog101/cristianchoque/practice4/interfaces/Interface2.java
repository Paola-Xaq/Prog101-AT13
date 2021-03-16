package org.fundacionjala.prog101.cristianchoque.practice4.interfaces;

public interface Interface2 extends Interface1{
    @Override
    default String method1(String field) {
        return "Method Inteface2 : "+field;
    }
}
