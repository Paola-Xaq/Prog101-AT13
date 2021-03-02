package org.fundacionjala.prog101.jessicka;

import org.fundacionjala.prog101.jessicka.DynamicPolimorphism.Animal;
import org.fundacionjala.prog101.jessicka.DynamicPolimorphism.Pig;
import org.fundacionjala.prog101.jessicka.DynamicPolimorphism.Dog;
import org.fundacionjala.prog101.jessicka.StaticPolymorphism.StaticPolymorphism;

public class MainJessicka {
    private MainJessicka() {
    }

    public static void main(final String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

        System.out.println("/////////////");
        StaticPolymorphism staticPolymorphism = new StaticPolymorphism();
        System.out.println(staticPolymorphism.add(2,3));      //method 1 called
        System.out.println(staticPolymorphism.add(2,3,4));    //method 2 called
        System.out.println(staticPolymorphism.add(2,3.4));    //method 4 called
        System.out.println(staticPolymorphism.add(2.5,3));    //method 3 called

    }
}
