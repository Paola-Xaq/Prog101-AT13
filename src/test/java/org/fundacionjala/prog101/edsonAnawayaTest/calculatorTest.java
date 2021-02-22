package org.fundacionjala.prog101.edsonAnawayaTest;
import static org.junit.Assert.*;

import org.junit.Test;
import org.fundacionjala.prog101.edsonAnawaya.*;

public class calculatorTest {
    @Test
    public void add_NumbersVoid_Cero(){
        Calculator calculator = new Calculator();
        final String NUMBERS = "";
        final int EXPECTED = 0;
        int result = calculator.add(NUMBERS);
        assertEquals(EXPECTED, result);
    }
}
