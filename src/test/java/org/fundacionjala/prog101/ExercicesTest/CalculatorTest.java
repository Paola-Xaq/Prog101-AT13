package org.fundacionjala.prog101.ExercicesTest;

import org.fundacionjala.prog101.ExercicesJP.Calculator;
import org.junit.Assert;
import org.junit.Test;
public class CalculatorTest {

    Calculator calculator;

    @Test
    public void add_EmptyString_Zero() {
        calculator = new Calculator();
        int expected = 0;
        int actual = calculator.add("");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add_OnlyOneNumber_One() {
        calculator = new Calculator();
        int expected = 1;
        int actual = calculator.add("1");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add_TwoNumbers_Three() {
        calculator = new Calculator();
        int expected = 3;
        int actual = calculator.add("2,1");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add_ManyNumbers_Fifteen() {
        calculator = new Calculator();
        int expected = 15;
        int actual = calculator.add("1,2,3,4,5");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add_NumbersBetweenNewLines_Six() {
        calculator = new Calculator();
        int expected = 6;
        int actual = calculator.add("1\n2,3");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add_NumberWithDifferentDelimiters_Three() {
        calculator = new Calculator();
        int expected = 11;
        int actual = calculator.add("//;\n1;5;5");
        Assert.assertEquals(expected,actual);
    }
}
