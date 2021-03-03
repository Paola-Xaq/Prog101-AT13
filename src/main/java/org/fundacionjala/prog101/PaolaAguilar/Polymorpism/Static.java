package org.fundacionjala.prog101.PaolaAguilar.Polymorpism;

public class Static { // Compile time poly

    // Method-function-operator overloading --Java doesn't support operator Overloading.
    public void print() {
        System.out.println("Print empty");
    }

    public void print(String stringChain) {
        System.out.println(stringChain);
    }

    public void print(int number) {
        System.out.println("print method with other parameter " + number);
    }

    public void print(int number, int number2) {
        System.out.println("print method with other parameter " + number + " plus "+ number2);
    }

    /*public String print() {
        return "This String method is not possible.";
    }


    public String print(String otherChain) {
        System.out.println("This method is not possible neither");
        return otherChain;
    } */
}
