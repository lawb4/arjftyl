package ch004.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class IntegerExamplesTest {
    @Test
    public void integerExploration() {
        Integer four = 4;
        assertEquals("intValue returns int 4",
                4, four.intValue());

        Integer five = Integer.valueOf("5");
        assertEquals("intValue returns int 5",
                5, five.intValue());
    }
}
