package org.fundacionjala.prog101;

import org.fundacionjala.prog101.Research.Car;
import org.fundacionjala.prog101.Research.Boxing;
import org.fundacionjala.prog101.Research.IntWrapper;
import org.fundacionjala.prog101.Research.Student;

import java.util.ArrayList;

public final class Main {

    public static void main(final String[] args) {
        boxing();
    }
    /**
     * Function to prove boxing concepts
     */
    public static void boxing() {
        int value = 1000;
        int value2 = 1000;
        int value3 = 3000;
        Boxing boxing = new Boxing();
        //autoboxing
        Integer integerObject = boxing.createObjectInteger(value);
        System.out.println("boxing:" + integerObject);
        //unboxing
        int primitive = boxing.getIntValue(integerObject);
        System.out.println("unboxed value: " + primitive);
        //casting, explicit boxing
        int casting = (int)234.99;
        System.out.println("Casting: " + casting);
        //CustomWrapper
        IntWrapper cIntWrapper = new IntWrapper(value);
        ArrayList<IntWrapper> numbers = new ArrayList<IntWrapper>();
        numbers.add(cIntWrapper);
        System.out.println("Print wrapper value: " + numbers.get(0));
        //Compare wrapper values
        IntWrapper d = new IntWrapper(value2);
        IntWrapper e = new IntWrapper(value3);
        System.out.println("Equals IntWrapper values 1000 and 1000: " + cIntWrapper.equals(d));
        System.out.println("Equals IntWrapper values 1000 and 3000: " + d.equals(e));
        System.out.println("Compare IntWrapper values 1000 and 1000: " + (cIntWrapper == d));
        System.out.println("Compare IntWrapper values 1000 and 3000: " + (d == e));
        //Compare IntWrapper with Integer
        System.out.println(cIntWrapper.equals(integerObject));
        //Operations with Wrapper values
        System.out.println(cIntWrapper.intValue() + d.intValue());
    }

    /**
     * Function to prove OpenClosePrinciple
     */
    public static void openClosedPrinciple() {
        Car[] arrayCoches = {
                new Car("Renault"),
                new Car("Audi")
        };
        printAveragePriceOfCar(arrayCoches);
    }

    /**
     * Function to printAveragePriceOfCar
     * @param arrayCoches
     */
    public static void printAveragePriceOfCar(Car[] arrayCoches) {
        for (Car car : arrayCoches) {
            if (car.getBrand().equals("Renault")) {
                System.out.println(18000);
            }
            if (car.getBrand().equals("Audi")) {
                System.out.println(25000);
            }
        }
    }
}
