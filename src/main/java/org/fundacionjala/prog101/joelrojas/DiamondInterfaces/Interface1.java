package org.fundacionjala.prog101.joelrojas.DiamondInterfaces;

public interface Interface1 {
    default String method1(String field) {
        return "Inteface1's method1";
    }
}
