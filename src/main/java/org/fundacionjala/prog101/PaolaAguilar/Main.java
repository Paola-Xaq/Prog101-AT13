package org.fundacionjala.prog101;

import org.fundacionjala.prog101.PaolaAguilar.*;

import java.util.ArrayList;
import java.util.List;
//import java.awt.*;

public final class Main {

    private Main() {
    }

    public static void main(final String[] args) {
        // Abstraction Test

        //Abstract
        Shape form1 = new Circle("Blue", 2);
        System.out.println(form1.toString());

        System.out.println("--------------");
        //Interface
        InterfaceShape form2 = new Rectangle();
        form2.messageA();
        form2.messageB();

        // Inheritance
        User usuario = new User("Paola", "Aguilar", 29, 2, "correo@gmail.com");
        usuario.sayHi();
        usuario.sayHiP();


        //Encapsulamiento
        Person persona = new Person("Paola", "Aguilar", 29);

        System.out.println(persona.var);
        //System.out.println(persona.var1);
        //System.out.println(persona.var2);

        //Polimorfismo
        Person persona2 = new Person();

        System.out.println("Boxing and Unboxing");
        //AutoBoxing

        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            li.add(i); // Java convierte a INTEGER i (to wrapper class)
        }
        System.out.println(sumEven(li));

    }

    // Unboxing
    public static int sumEven(List<Integer> li) {
        int sum = 0;
        for (Integer i: li)
            if (i % 2 == 0)
                sum += i;
        return sum;
    }

}
