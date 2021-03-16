package org.fundacionjala.prog101.jessicka.exam.categories;

import org.junit.Test;

import static org.junit.Assert.*;

public class MeatTest {
    @Test
    public void getType_Meat_Meat() {
        Meat meat = new Meat();
        String actual = meat.type;
        assertEquals("Meat", actual);
    }
}