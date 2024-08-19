package ch004testswithotherclasses.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ex004_2 {
    @Test
    public void confirmMaxAndMinIntegerSizes() {
        assertEquals("INTEGER_MIN_VALUE is",
                -2147483648, Integer.MIN_VALUE);
        assertEquals("INTEGER_MAX_VALUE is",
                2147483647, Integer.MAX_VALUE);
    }
}
