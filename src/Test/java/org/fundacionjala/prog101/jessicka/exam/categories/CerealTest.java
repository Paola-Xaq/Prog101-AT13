package org.fundacionjala.prog101.jessicka.exam.categories;

import org.junit.Test;

import static org.junit.Assert.*;

public class CerealTest {
    @Test
    public void getType_Cereal_Cereal() {
        Cereal cereal = new Cereal();
        String actual = cereal.type;
        assertEquals("Cereal", actual);
    }
}