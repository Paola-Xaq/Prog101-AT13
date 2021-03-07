package org.fundacionjala.prog101.ExercicesJP.multiplesInterfaces;

public interface Interface1 {
    default void message(){
        System.out.println("Message from Interface1");
    }

    default void operation(int a, int b){
        System.out.println("result add: "+(a+b));
    }

    default void show(){
        System.out.println("Hello from Interface1");
    }
}
