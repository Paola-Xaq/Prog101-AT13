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
    public void add_NumberWithDifferentDelimiters_Eleven() {
        calculator = new Calculator();
        int expected = 11;
        int actual = calculator.add("//;\n1;5;5");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add_NumberWithDifferentDelimiters_Six() {
        calculator = new Calculator();
        int expected = 6;
        int actual = calculator.add("//.\n1.3.2");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add_NumberWithDifferentDelimiters_Ten() {
        calculator = new Calculator();
        int expected = 10;
        int actual = calculator.add("//*\n5*3*2");
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void add_StringWithNegativeNumber_Exception() {
        calculator = new Calculator();
        calculator.add("-1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void add_StringWithNegativeNumberAndOtherNumber_Exception() {
        calculator = new Calculator();
        calculator.add("-1,2");
    }

    @Test(expected = IllegalArgumentException.class)
    public void add_StringWithManyNegativeNumber_Exception() {
        calculator = new Calculator();
        calculator.add("-1,-5,-6");
    }

    @Test
    public void add_OnlyNumberLessThanOrEqualsTo1000_Two() {
        calculator = new Calculator();
        int expected = 2;
        int actual = calculator.add("2,1001");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add_OnlyNumberLessThanOrEqualsTo1000_1002() {
        calculator = new Calculator();
        int expected = 1002;
        int actual = calculator.add("2,1000");
        Assert.assertEquals(expected,actual);
    }
    
    @Test
    public void add_OnlyNumberLessThanOrEqualsTo1000_0() {
        calculator = new Calculator();
        int expected = 0;
        int actual = calculator.add("1201,1001");
        Assert.assertEquals(expected,actual);
    }
}
