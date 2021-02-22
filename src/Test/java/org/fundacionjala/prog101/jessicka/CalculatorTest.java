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

    @Test (expected = IllegalArgumentException.class)
    public void sum_OneNegativeNumber_IllegalArgumentException() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum("-5");
    }

    @Test (expected = IllegalArgumentException.class)
    public void sum_MoreNegativeNumber_IllegalArgumentException() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum("-5,-6,2");
    }

    @Test
    public void sum_NumberBiggerThanOneThousandPlusTwo_Two() {
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = calculator.sum("2,1001");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sum_TwoPlusOneThousand_OneThousandTwo() {
        Calculator calculator = new Calculator();
        int expected = 1002;
        int actual = calculator.sum("2,1000");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sum_NumberBiggerThanOneThousand_Zero() {
        Calculator calculator = new Calculator();
        int expected = 0;
        int actual = calculator.sum("1002");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sum_WithDelimitersOfAnyLength_Six() {
        Calculator calculator = new Calculator();
        int expected = 6;
        int actual = calculator.sum("//[-]\n1-2-3");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sum_WithMultipleDelimiters_Six() {
        Calculator calculator = new Calculator();
        int expected = 6;
        int actual = calculator.sum("//[-][%]\n1-2%3");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sum_WithMultipleDelimiters_Ten() {
        Calculator calculator = new Calculator();
        int expected = 10;
        int actual = calculator.sum("//[;][*]\n1;2*3*4");
        Assert.assertEquals(expected,actual);
    }
}
