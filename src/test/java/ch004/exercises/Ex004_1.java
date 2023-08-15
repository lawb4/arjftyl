package ch004.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ex004_1 {
    @Test
    public void checkIntToHexConversion() {
        String elevenToString = Integer.toHexString(11);
        String tenToString = Integer.toHexString(10);
        String threeToString = Integer.toHexString(3);
        String twentyOneToString = Integer.toHexString(21);

        assertEquals("11 = b","b", elevenToString);
        assertEquals("10 = a","a", tenToString);
        assertEquals("3 = 3","3", threeToString);
        assertEquals("21 = 15","15", twentyOneToString);
    }
}
