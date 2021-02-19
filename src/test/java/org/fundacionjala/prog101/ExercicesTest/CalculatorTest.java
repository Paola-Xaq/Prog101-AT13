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
}
