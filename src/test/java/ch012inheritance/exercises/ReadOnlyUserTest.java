package ch012inheritance.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReadOnlyUserTest {

    @Test
    public void createValidReadOnlyUser() {
        ReadOnlyUser ruser = new ReadOnlyUser();

        assertEquals("username", ruser.getUsername());
        assertEquals("password", ruser.getPassword());
        assertEquals("ReadOnly", ruser.getPermission());

    }
}
