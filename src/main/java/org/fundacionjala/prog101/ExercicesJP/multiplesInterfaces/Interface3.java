package org.fundacionjala.prog101.ExercicesJP.multiplesInterfaces;

public interface Interface3 extends Interface1{
    default void message(){
        System.out.println("Message from Interface3");
    }

    default void operation(int a, int b){
        System.out.println("result resta: "+(a-b));
    }
}
