package org.fundacionjala.prog101.cristianchoque;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add_StringWithoutNumber_Zero() {
        // prerequisites
        Calculator calculator = new Calculator();
        // Actions
        int expected = 0;
        int actual = calculator.add("");
        // Verification
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add_StringWithOneNumber_Two() {
        // prerequisites
        Calculator calculator = new Calculator();
        // Actions
        int expected = 2;
        int actual = calculator.add("2");
        // Verification
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add_StringWithTwoNumberOneAndTwo_Three() {
        // prerequisites
        Calculator calculator = new Calculator();
        // Actions
        int expected = 3;
        int actual = calculator.add("1,2");
        // Verification
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add_StringWithManyNumbersOneTwoThreeFourFiveSixSeven_TwentyEight() {
        // prerequisites
        Calculator calculator = new Calculator();
        // Actions
        int expected = 28;
        int actual = calculator.add("1,2,3,4,5,6,7");
        // Verification
        Assert.assertEquals(expected,actual);
    }
}