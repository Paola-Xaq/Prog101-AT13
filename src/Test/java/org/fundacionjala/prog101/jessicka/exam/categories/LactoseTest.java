package org.fundacionjala.prog101.jessicka.exam.categories;

import org.junit.Test;

import static org.junit.Assert.*;

public class LactoseTest {
    @Test
    public void getType_Lactose_Lactose() {
        Lactose lactose = new Lactose();
        String actual = lactose.type;
        assertEquals("Lactose", actual);
    }
}