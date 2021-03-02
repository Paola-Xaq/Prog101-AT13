package org.fundacionjala.prog101.joelrojas.polymorphism;

public class Main {
    public static void main(String[] args) {
        //override polymorphism
        //Animal bird = new Animal();
        Animal bird = new FlyingAnimal(5);
        Animal fish = new AcuaticAnimal(10, 2);
        doMove(bird);
        System.out.println("----------");
        doMove(fish);

        //overload polymorphism
        Maths myMaths = new Maths();
        System.out.println(myMaths.add(4, 8));
        System.out.println(myMaths.add(5.5, 6.7));
        System.out.println(myMaths.add(4, 8, 45));
        System.out.println(myMaths.add(5.5, 6.7, 9.5));
    }

    public static void doMove(Animal animal) {
        animal.move();
    }
}
