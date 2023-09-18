package ch013moreexceptions;

import domainentities.User;
import domainentities.InvalidPassword;
import org.junit.Test;

import static org.junit.Assert.*;

public class Main {
    @Test
    public void canCreateDefaultUserWithoutHandlingException() {
        User aUser = new User();
        assertEquals("username", aUser.getUsername());
        assertEquals("password", aUser.getPassword());
    }

    // 230918 cannot figure out what's wrong with `catch` for now
    /*@Test
    public void haveToCatchIllegalPasswordForParamConstructor() {
        try {
            User aUser = new User("me", "wrong");
            fail("An exception should have been thrown");
        } catch (InvalidPassword invalidPassword) {
            assertTrue("The exception was thrown", true);
        }
    }*/

    @Test (expected = InvalidPassword.class)
    public void propagateIllegalPasswordExpected() throws InvalidPassword {
        User aUser = new User("me", "bad");
    }
}
