package ch010collections;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Main {
    public static void main(String[] args) {

    }

    @Test
    public void simpleArrayExample() {
        String[] numbers0123 = {"zero", "one", "two", "three"};
        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }
        assertEquals("zero", numbers0123[0]);
        assertEquals("three", numbers0123[3]);
    }

    @Test
    public void simpleCollectionExample() {
        String[] numbers0123Array = {"zero", "one", "two", "three"};
        List<String> numbers0123 = Arrays.asList(numbers0123Array);
        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }
        assertEquals("zero", numbers0123.get(0));
        assertEquals("three", numbers0123.get(3));
    }

    @Test
    public void simpleDynamicCollectionExample() {
        List<String> numbers0123 = new ArrayList<>();

        numbers0123.add("zero");
        numbers0123.add("one");
        numbers0123.add("two");
        numbers0123.add("three");

        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }

        assertEquals("zero", numbers0123.get(0));
        assertEquals("three", numbers0123.get(3));
    }

    @Test
    public void getAnElementAtAnIndex() {
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        assertEquals("Monday", days.get(0));
        assertEquals("Tuesday", days.get(1));
        assertEquals("Wednesday", days.get(2));
    }

    @Test
    public void removeAnElementAtAnIndex() {
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        days.remove(1);

        assertEquals(2, days.size());
        assertEquals("Monday", days.get(0));
        assertEquals("Wednesday", days.get(1));
    }

    @Test
    public void setDoesNotAllowDuplicateElements() {
        Set workdays = new HashSet();

        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");

        assertEquals(1, workdays.size());
    }

    @Test
    public void checkContentsOfMap() {
        Map<String, String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        assertTrue(map.containsKey("key1"));
        assertFalse(map.containsKey("key23"));
        assertTrue(map.containsValue("value2"));
        assertFalse(map.containsValue("value23"));
    }
}

