package org.fundacionjala.prog101.joelrojas.DiamondInterfaces;

public interface Interface3 extends Interface1{
    @Override
    default String method1(String field) {
        return "Inteface3's method1";
    }
}
