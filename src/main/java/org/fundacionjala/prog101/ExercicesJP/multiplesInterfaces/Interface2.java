package org.fundacionjala.prog101.ExercicesJP.multiplesInterfaces;

public interface Interface2 extends Interface1{
    default void message(){
        System.out.println("Message from Interface2");
    }

    default void operation(int a, int b){
        System.out.println("multi result: "+(a*b));
    }
}
