package ch003myfirsttest.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ex003_1 {
    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2 + 2;
        /* checking for the incorrect value (5 instead of 4)
        and becoming familiar with a result of a failing method */
        assertEquals("2+2=4", 5, answer);
    }
}
