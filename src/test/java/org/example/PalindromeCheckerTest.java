package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindromeWithPalindromeWord() {
        assertTrue(PalindromeChecker.isPalindrome("level"));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeWord() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeWithSpaceSeparatedPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"));
    }
}
