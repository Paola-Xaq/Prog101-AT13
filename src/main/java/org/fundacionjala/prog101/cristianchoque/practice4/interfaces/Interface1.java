package org.fundacionjala.prog101.cristianchoque.practice4.interfaces;

public interface Interface1 {
    default String method1(String field) {
        return "Method Inteface1 : "+field;
    }
}