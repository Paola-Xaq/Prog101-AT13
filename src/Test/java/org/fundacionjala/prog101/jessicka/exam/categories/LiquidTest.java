package org.fundacionjala.prog101.jessicka.exam.categories;

import org.junit.Test;

import static org.junit.Assert.*;

public class LiquidTest {
    @Test
    public void getType_Liquid_Liquid() {
        Liquid liquid = new Liquid();
        String actual = liquid.type;
        assertEquals("Liquid", actual);
    }
}