package org.fundacionjala.prog101.edsonAnawaya.classInterface;

interface Sum {
    public int sum(int a, int b);
}

interface Rest {
    public int rest(int a, int b);
}

class Calculator implements Sum {


   @Override
    public int sum(int a, int b) {
        return 0;
    }
}

class Calculator2 implements Sum,Rest {


    @Override
    public int sum(int a, int b) {
        return 0;
    }

    @Override
    public int rest(int a, int b) {
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1,2));

        Calculator2 calculator2 = new Calculator2();
        System.out.println(calculator2.sum(1,2));
        System.out.println(calculator2.rest(1,2));

    }
}