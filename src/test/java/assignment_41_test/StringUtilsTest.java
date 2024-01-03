package assignment_41_test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import assignment_41.StringUtils;

public class StringUtilsTest {

    // Create an instance of StringUtils to test its methods
    private StringUtils stringUtils = new StringUtils();

    @Test
    public void testReverse() {
        assertEquals("olleh", stringUtils.reverse("hello"));
        assertEquals("", stringUtils.reverse(""));
        assertEquals("a", stringUtils.reverse("a"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("radar"));
        assertFalse(stringUtils.isPalindrome("hello"));
        assertTrue(stringUtils.isPalindrome(""));
        assertTrue(stringUtils.isPalindrome("a"));
    }

    @Test
    public void testConcatenate() {
        assertEquals("HelloWorld", stringUtils.concatenate("Hello", "World"));
        assertEquals("test", stringUtils.concatenate("", "test"));
        assertEquals("test", stringUtils.concatenate("test", ""));
        assertEquals("", stringUtils.concatenate("", ""));
    }

    @Test
    public void testCountOccurrences() {
        assertEquals(2, stringUtils.countOccurrences("hello", 'l'));
        assertEquals(0, stringUtils.countOccurrences("", 'a'));
        assertEquals(3, stringUtils.countOccurrences("aaa", 'a'));
        assertEquals(1, stringUtils.countOccurrences("test", 'e'));
    }
}
