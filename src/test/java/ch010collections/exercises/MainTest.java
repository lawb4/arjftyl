package ch010collections.exercises;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void useForLoopInsteadOfWhile() {
        String[] arrDays = {"Tuesday", "Thursday",
                "Wednesday", "Monday",
                "Saturday", "Sunday",
                "Friday"};

        List<String> daysList = Arrays.asList(arrDays);

        int count = 0;
        while (count < daysList.size()) {
            System.out.println(daysList.get(count));
            count++;
        }
        assertEquals("Tuesday", daysList.get(0));
        assertEquals("Friday", daysList.get(daysList.size() - 1));

        System.out.println("=====================");

        for (int i = 0; i < daysList.size(); i++) {
            System.out.println(daysList.get(i));
        }
        assertEquals("Thursday", daysList.get(1));
        assertEquals("Sunday", daysList.get(daysList.size() - 2));
    }

    @Test
    public void createAndManipulateCollectionOfUsers() {
        //Create a Collection of Users
        Collection<User> usersCollection1 = new ArrayList<>();
        //Assert that the size()==0 and isEmpty()==true
        assertEquals("Collection size = 0", 0, usersCollection1.size());
        assertTrue("Collection is empty", usersCollection1.isEmpty());
        //Create two User objects
        User user1 = new User("user1", "pass1");
        User user2 = new User("user2", "pass2");
        //Add the User objects to the collection
        usersCollection1.add(user1);
        usersCollection1.add(user2);
        //Assert that the size()==2 and isEmpty()==false
        assertEquals("Collection size = 2", 2, usersCollection1.size());
        assertFalse("Collection is not empty", usersCollection1.isEmpty());
        //Create a second collection with two different users
        Collection<User> usersCollection2 = new ArrayList<>();
        usersCollection2.add(new User("user3", "pass3"));
        usersCollection2.add(new User("user4", "pass4"));
        //addAll the second collection to the first collection
        usersCollection1.addAll(usersCollection2);
        //check that the first collection now contains objects from the second collection
        assertTrue("`usersCollection1` contains objects from `usersCollection2`",
                usersCollection1.containsAll(usersCollection2));
        //removeAll the User objects from the second collection
        usersCollection2.removeAll(usersCollection2);
        assertTrue("userCollection2 is empty", usersCollection2.isEmpty());
        //clear the first collection
        usersCollection1.clear();
        assertTrue("userCollection1 is empty", usersCollection1.isEmpty());
    }
}
