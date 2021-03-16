package org.fundacionjala.prog101.jessicka.exam.categories;

import org.fundacionjala.prog101.jessicka.exam.Store;
import org.junit.Test;

import static org.junit.Assert.*;

public class FruitTest {
    @Test
    public void getType_Fruit_Fruit() {
        Fruit fruit = new Fruit();
        String actual = fruit.type;
        assertEquals("Fruit", actual);
    }
}