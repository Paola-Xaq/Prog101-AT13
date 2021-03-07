package org.fundacionjala.prog101.joelrojas.DiamondInterfaces;

public class ClassName implements Interface2, Interface3{
    String field;

    @Override
    public String method1(String field) {
        return Interface3.super.method1(field);
    }
}
