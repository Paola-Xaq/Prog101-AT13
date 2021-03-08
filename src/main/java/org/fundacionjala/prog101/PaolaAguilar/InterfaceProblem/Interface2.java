package org.fundacionjala.prog101.PaolaAguilar.InterfaceProblem;

public interface Interface2 extends Interface1{
    @Override
    default String method1() {
        return "Method1 from Interface2";
    }
}
