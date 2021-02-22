package org.fundacionjala.prog101.Excercies_Jorge;

import org.fundacionjala.prog101.ExercicesJP.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void add_EmptyString_Zero() {
        StringCalculator calculator = new StringCalculator();
        int expected = 0;
        int actual = calculator.add("");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getArray_shoudShow_ArrayOfStrings() {
        StringCalculator calculator = new StringCalculator();
        String[] expected = {"1","2","3","4"};
        String[] actual = calculator.getArrayOfNums("1,2,3,4");
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void add_OnePlusTwo_Three() {
        StringCalculator calculator = new StringCalculator();
        int expected = 3;
        int actual = calculator.add("1,2");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void add_TwoplusTwoWithDiferentDelimiter_Two() {
        StringCalculator calculator = new StringCalculator();
        int expected = 6;
        int actual = calculator.add("1\n2,3" );
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void add_TwoPlusHigherThanThousand_Two() {
        StringCalculator calculator = new StringCalculator();
        int expected = 2;
        int actual = calculator.add("2,1001");
        Assert.assertEquals(expected,actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void add_minusTwo_ThrowExceptionIfNegative() {
        StringCalculator calculator = new StringCalculator();
        int actual = calculator.add("1,-2");
    }
    @Test
    public void add_One_Plus_One_WithDiferentDelimiter_Two() {
        StringCalculator calculator = new StringCalculator();
        int expected = 2;
        int actual = calculator.add("//;\n1;1");
        Assert.assertEquals(expected,actual);
    }
}