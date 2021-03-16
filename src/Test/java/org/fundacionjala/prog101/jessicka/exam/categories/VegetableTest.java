package org.fundacionjala.prog101.jessicka.exam.categories;

import org.junit.Test;

import static org.junit.Assert.*;

public class VegetableTest {
    @Test
    public void getType_Vegetable_Vegetable() {
        Vegetable vegetable = new Vegetable();
        String actual = vegetable.type;
        assertEquals("Vegetable", actual);
    }
}