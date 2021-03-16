package org.fundacionjala.prog101.joelrojas.supermarket;
import org.junit.Test;
import static org.junit.Assert.*;
public class FormatTest {
    @Test
    public void testStandarComplete() {
        String expectedName = "Sugar     ";
        String actualName = Format.complete("Sugar");;
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testCompleteWithlenght() {
        String expectedName = "Rice           ";
        String actualName = Format.complete("Rice", 15);;
        assertEquals(expectedName, actualName);
    }
}
