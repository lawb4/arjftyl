package ch008.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ch008Test {

    public static String catOrCats(int numberOfCats) {
        return numberOfCats == 1 ? "cat" : "cats";
    }

    @Test
    public void catOrCatsTest() {
        int numberOfCats = 2;

        assertEquals("2 == cats",
                "cats",
                catOrCats(numberOfCats));
    }

    @Test
    public void assertTrueIfTrue() {
        boolean truthy = true;

        if (truthy) assertTrue("truthy=true", truthy);
    }

    @Test
    public void assertTrueIfTrueFalseIfFalse() {
        boolean truthy = true;

        if (truthy) {
            assertTrue("truthy=true", truthy);
            assertFalse("truthy=false", !truthy);
        }
    }

    @Test
    public void assertTrueElseAssertFalse() {
        boolean truthy = true;

        if (truthy) assertTrue(truthy);
        else assertFalse(truthy);
    }

    @Test
    public void assertTrueElseAssertFalseV2() {
        boolean truthy = true;

        if (truthy) {
            assertTrue(truthy);
            assertFalse(!truthy);
        } else {
            assertFalse(truthy);
        }
    }

    @Test
    public void nestedIfElseHorror() {
        boolean truthy = true;
        boolean falsey = false;

        if (truthy) {
            if (!falsey) {
                if (truthy && !falsey) {
                    if (falsey || truthy) {
                        assertTrue(truthy);
                        assertFalse(falsey);
                    }
                }
            } else {
                assertTrue(truthy);
                assertTrue(falsey);
            }
        } else {
            if (!truthy) {
                if (falsey) {
                    assertTrue(falsey);
                    assertFalse(truthy);
                } else {
                    assertFalse(falsey);
                    assertFalse(truthy);
                }
            }
        }
    }

    public static String getFullNameByShortCode(String shortCode) {
        String fullName;

        switch (shortCode.toUpperCase()) {
            case "UK":
                fullName = "United Kingdom";
                break;
            case "US":
            case "USA":
                fullName = "United States";
                break;
            case "FR":
                fullName = "France";
                break;
            case "SE":
                fullName = "Sweden";
                break;
            default:
                fullName = "Rest Of World";
        }
        return fullName;
    }

    @Test
    public void switchOnShortCode() {
        assertEquals("United Kingdom", getFullNameByShortCode("UK"));
        assertEquals("United States", getFullNameByShortCode("uS"));
        assertEquals("United States", getFullNameByShortCode("uSa"));
        assertEquals("France", getFullNameByShortCode("Fr"));
        assertEquals("Sweden", getFullNameByShortCode("sE"));
        assertEquals("Rest Of World", getFullNameByShortCode("some other country"));
    }

    public static String getStringFromInt(int num) {
        String str = "";

        switch (num) {
            case 1:
                str = "One";
                break;
            case 2:
                str = "Two";
                break;
            case 3:
                str = "Three";
                break;
            case 4:
                str = "Four";
                break;
            default:
                if (num > 4) {
                    str = "Too Big";
                }
                if (num < 1) {
                    str = "Too Small";
                }
        }
        return str;
    }

    public static String getStringFromIntV2(int num) {
        String str = "";

        switch (num) {
            case 1:
                return "One";
            case 2:
                return  "Two";
            case 3:
                return  "Three";
            case 4:
                return  "Four";
            default:
                if (num > 4) {
                    return  "Too Big";
                }
        }
        return "Too Small";
    }

    @Test
    public void switchOnInt() {
        assertEquals("One", getStringFromInt(1));
        assertEquals("Two", getStringFromInt(2));
        assertEquals("Three", getStringFromInt(3));
        assertEquals("Four", getStringFromInt(4));
        assertEquals("Too Small", getStringFromInt(0));
        assertEquals("Too Small", getStringFromInt(Integer.MIN_VALUE));
        assertEquals("Too Big", getStringFromInt(Integer.MAX_VALUE));
    }

    @Test
    public void switchOnIntV2() {
        assertEquals("One", getStringFromIntV2(1));
        assertEquals("Two", getStringFromIntV2(2));
        assertEquals("Three", getStringFromIntV2(3));
        assertEquals("Four", getStringFromIntV2(4));
        assertEquals("Too Small", getStringFromIntV2(0));
        assertEquals("Too Small", getStringFromIntV2(Integer.MIN_VALUE));
        assertEquals("Too Big", getStringFromIntV2(Integer.MAX_VALUE));
    }
}
