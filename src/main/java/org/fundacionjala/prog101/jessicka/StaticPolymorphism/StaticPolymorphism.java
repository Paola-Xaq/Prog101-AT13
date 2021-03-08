package org.fundacionjala.prog101.jessicka.StaticPolymorphism;

public class StaticPolymorphism {
    public int add(int number1, int number2){  //method 1
        return number1 + number2;
    }

    public int add(int number1, int number2, int number3){ //method 2
        return number1 + number2 + number3;
    }

    public int add(double number1, int number2){ //method 3
        return (int)number1 + number2;
    }

    public int add(int number1, double number2){ //method 4
        return number1 + (int)number2;
    }
}
