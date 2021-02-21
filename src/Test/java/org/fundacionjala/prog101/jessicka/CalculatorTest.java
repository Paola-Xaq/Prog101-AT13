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

}
