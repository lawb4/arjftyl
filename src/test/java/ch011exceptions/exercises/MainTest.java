package ch011exceptions.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void useExceptionAsObject() {
        Integer age = null;
        String ageAsString;
        String yourAge;


        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
            System.out.println("getMessage - " + e.getMessage());
            System.out.println("getStacktrace - " + e.getStackTrace());
            System.out.println("printStackTrace");
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument: " + e.getMessage());
        } finally {
            yourAge = "You are " + age.toString() + " years old";
        }

        assertEquals("You are 18 years old", yourAge);
    }
}
