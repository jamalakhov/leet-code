package easy.PalindromeNumber9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    // Given an integer x, return true if x is a palindrome,
    // and false otherwise.
    // Example:
    // Input: x = 121
    // Output: true
    // Explanation: 121 reads as 121 from left to right and from right to left.

    @Test
    void testIsPalindrome() {
        int number1 = 121;
        int number2 = 10;
        Solution solution = new Solution();

        assertTrue(solution.isPalindrome(number1));
        assertFalse(solution.isPalindrome(number2));
    }
}