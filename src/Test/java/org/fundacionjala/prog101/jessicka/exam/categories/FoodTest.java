package org.fundacionjala.prog101.jessicka.exam.categories;

import org.junit.Test;

import static org.junit.Assert.*;

public class FoodTest {
    @Test
    public void getType_Food_Food() {
        Food food = new Food();
        String actual = food.type;
        assertEquals("Food", actual);
    }
}