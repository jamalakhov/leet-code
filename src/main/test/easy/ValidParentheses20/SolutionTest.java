package easy.ValidParentheses20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    // Given a string s containing just the characters
    // '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    // An input string is valid if:
    // Open brackets must be closed by the same type of brackets.
    // Open brackets must be closed in the correct order.
    // Every close bracket has a corresponding open bracket of the same type.

    // Example 1:
    // Input: s = "()"
    // Output: true

    // Example 2:
    // Input: s = "(]"
    // Output: false

    @Test
    void testIsValid(){
        Solution solution = new Solution();

        String input1 = "()[]{}";
        String input2 = "(]";

        assertTrue(solution.isValid(input1));
        assertFalse(solution.isValid(input2));
    }
}