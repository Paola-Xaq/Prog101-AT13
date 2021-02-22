package org.fundacionjala.prog101.jessicka;

import org.fundacionjala.prog101.jessicka.Calculator;
import org.junit.Assert;
import org.junit.Test;
public class CalculatorTest {

    @Test
    public void sum_OneTwo_Three() {
        Calculator calculator = new Calculator();
        int expected = 3;
        int actual = calculator.sum("1,2");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sum_OneTwoThree_Six() {
        Calculator calculator = new Calculator();
        int expected = 6;
        int actual = calculator.sum("1,2,3");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sum_EmptyString_Zero() {
        Calculator calculator = new Calculator();
        int expected = 0;
        int actual = calculator.sum("");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sum_NewLinesBetweenNumbers_Six() {
        Calculator calculator = new Calculator();
        int expected = 6;
        int actual = calculator.sum("1\n2,3");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sum_WithDifferentDelimiters_Six() {
        Calculator calculator = new Calculator();
        int expected = 3;
        int actual = calculator.sum("//;\n1;2");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sum_WithDifferentDelimiters_Four() {
        Calculator calculator = new Calculator();
        int expected = 4;
        int actual = calculator.sum("//*\n3*1");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sum_WithDifferentDelimiters_Five() {
        Calculator calculator = new Calculator();
        int expected = 5;
        int actual = calculator.sum("//.\n2.1.1.1");
        Assert.assertEquals(expected,actual);
    }

}