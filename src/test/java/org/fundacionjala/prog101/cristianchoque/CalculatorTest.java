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

    @Test
    public void add_StringWithNewLinesBetweenNumbersOneTwoThree_Six() {
        // prerequisites
        Calculator calculator = new Calculator();
        // Actions
        int expected = 6;
        int actual = calculator.add("1\n2,3");
        // Verification
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add_StringWithOtherDelimiterOneTwo_Three() {
        // prerequisites
        Calculator calculator = new Calculator();
        // Actions
        int expected = 3;
        int actual = calculator.add("//;\n1;2");
        // Verification
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add_StringWithDifferentDelimiterOneTwoThreeFour_Then() {
        // prerequisites
        Calculator calculator = new Calculator();
        // Actions
        int expected = 10;
        int actual = calculator.add("//[-][%]\n1-2%3-4");
        // Verification
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add_StringWithDifferentDelimiter1001TwoThreeFour_Nine() {
        // prerequisites
        Calculator calculator = new Calculator();
        // Actions
        int expected = 9;
        int actual = calculator.add("//[-][%]\n1001-2%3-4");
        // Verification
        Assert.assertEquals(expected,actual);
    }
}