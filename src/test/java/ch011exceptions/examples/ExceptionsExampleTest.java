package ch011exceptions.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionsExampleTest {

    @Test
    public void throwANullPointerException() {
        Integer age = null;
        //Integer age = 18;

        String ageAsString = age.toString();

        String yourAge = "You are " + ageAsString + " years old";

        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void catchANullPointerException() {
        Integer age = null;
        String ageAsString;

        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        }

        String yourAge = "You are " + age.toString() + " years old";

        assertEquals("You are 18 years old", yourAge);
    }
}
