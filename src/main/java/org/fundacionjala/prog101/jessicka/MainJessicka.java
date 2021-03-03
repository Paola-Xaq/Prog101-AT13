package org.fundacionjala.prog101.jessicka;

import org.fundacionjala.prog101.jessicka.DynamicPolimorphism.Animal;
import org.fundacionjala.prog101.jessicka.DynamicPolimorphism.Pig;
import org.fundacionjala.prog101.jessicka.DynamicPolimorphism.Dog;
import org.fundacionjala.prog101.jessicka.StaticPolymorphism.StaticPolymorphism;
import org.fundacionjala.prog101.jessicka.TypeStudent.GraduatedStudent;
import org.fundacionjala.prog101.jessicka.TypeStudent.UnderGraduatedStudent;

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

        System.out.println("/////////////");
        Student student = new Student("jessicka");
        student.setTestScore(85, 3);
        System.out.println(student.getName());
        System.out.println(student.getTestScore(3));
        System.out.println(student.getCourseGrade());
        System.out.println(student.computeCourseGrade());
        System.out.println("/////////////////////////");

        UnderGraduatedStudent underGraduated = new UnderGraduatedStudent();
        underGraduated.setTestScore(51, 0);
        underGraduated.setTestScore(51, 1);
        underGraduated.setTestScore(51, 2);
        underGraduated.setTestScore(51, 3);
        underGraduated.setTestScore(51, 4);
//        underGraduated.setTestScore(50, 0);
//        underGraduated.setTestScore(50, 1);
//        underGraduated.setTestScore(50, 2);
//        underGraduated.setTestScore(50, 3);
//        underGraduated.setTestScore(50, 4);
        System.out.println(underGraduated.computeCourseGrade());

        System.out.println("/////////////////////////");
        GraduatedStudent graduated = new GraduatedStudent();
//        graduated.setTestScore(70, 0);
//        graduated.setTestScore(90, 1);
//        graduated.setTestScore(90, 2);
//        graduated.setTestScore(80, 3);
//        graduated.setTestScore(90, 4);
        graduated.setTestScore(70, 0);
        graduated.setTestScore(70, 1);
        graduated.setTestScore(70, 2);
        graduated.setTestScore(70, 3);
        graduated.setTestScore(70, 4);
        System.out.println(graduated.computeCourseGrade());
    }
}
