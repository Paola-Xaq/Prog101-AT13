package org.fundacionjala.prog101.ExercicesJP.multiplesInterfaces;

public class Main {
    public static void main(String[] args) {
        MultipleInterface multipleInterface = new MultipleInterface();
        multipleInterface.message();
        multipleInterface.operation(3,3);
        Interface1 a = new MultipleInterface();
        a.operation(2,2);
        a.show();
        multipleInterface.show();
    }
}
