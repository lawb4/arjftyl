package ch003myfirsttest.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ex003_2 {
    @Test
    public void canSubtractTwoFromTwo() {
        int answer = 0;
        assertEquals("2-2=0", 0, answer);
    }

    @Test
    public void canDivideFourByTwo() {
        int answer = 2;
        assertEquals("4/2=2", 2, answer);
    }

    @Test
    public void canMultiplyTwoByTwo() {
        int answer = 4;
        assertEquals("2*2=4", 4, answer);
    }
}
