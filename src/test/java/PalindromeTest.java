import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void whenEmptyString_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("sas"));
    }


    @Test
    public void whenPalindrom_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("noon"));
    }

    @Test
    public void whenNearPalindrom_thanReject(){
        Palindrome palindromeTester = new Palindrome();
        assertFalse(palindromeTester.isPalindrome("neon"));
    }

}