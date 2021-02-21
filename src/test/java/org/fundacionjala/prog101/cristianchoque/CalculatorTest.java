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
}