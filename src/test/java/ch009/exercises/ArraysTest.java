package ch009.exercises;

import domainentities.User;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysTest {
    @Test
    public void createAnArray() {
        User[] users = new User[3];
        users[0] = new User("user1", "pass1");
        users[1] = new User("user2", "pass2");
        users[2] = new User("user3", "pass3");

        assertEquals("user1", users[0].getUsername());
        assertEquals("pass2", users[1].getPassword());
        assertEquals("user3", users[2].getUsername());
    }

    @Test
    public void iterateOverArrayOfUsers() {
        User[] users = new User[3];
        users[0] = new User("user1", "pass1");
        users[1] = new User("user2", "pass2");
        users[2] = new User("user3", "pass3");

        assertEquals("user1", users[0].getUsername());
        assertEquals("user2", users[1].getUsername());
        assertEquals("user3", users[2].getUsername());

        for (User user : users) {
            System.out.println(user.getUsername());
        }
    }

    @Test
    public void createArrayOf100Users() {
        User[] users = new User[100];

        for (int i = 0; i < users.length; i++) {
            int uid = i + 1;
            users[i] = new User("user" + uid,
                    "password" + uid);
        }

        // check array is created
        assertEquals("array is created",
                users.length, 100);

        for (User user : users) {
            System.out.println(user.getUsername() + ", " + user.getPassword());
        }

        // check array is filled properly
        int uid = 1;
        for (User user : users) {
            assertNotNull("array elem is not null", user);
            assertEquals("user" + uid, user.getUsername());
            assertEquals("password" + uid, user.getPassword());
            uid++;
        }
    }

    @Test
    public void sortWorkdaysArrayAndAssertResult() {
        String[] workdays = {"Monday",
                            "Tuesday",
                            "Wednesday",
                            "Thursday",
                            "Friday"};

        Arrays.sort(workdays);

        assertEquals(workdays[0], "Friday");
        assertEquals(workdays[1], "Monday");
        assertEquals(workdays[2], "Thursday");
        assertEquals(workdays[3], "Tuesday");
        assertEquals(workdays[4], "Wednesday");
    }

    @Test
    public void sortWorkdaysArrayAndAssertResultMixedCase() {
        String[] workdays = {"monday",
                            "Tuesday",
                            "Wednesday",
                            "thursday",
                            "Friday"};

        Arrays.sort(workdays);

        assertEquals(workdays[0], "Friday");
        assertEquals(workdays[1], "Tuesday");
        assertEquals(workdays[2], "Wednesday");
        assertEquals(workdays[3], "monday");
        assertEquals(workdays[4], "thursday");
    }
}
