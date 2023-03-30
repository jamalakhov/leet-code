package easy.LongestCommonPrefix14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    // Write a function to find the longest common prefix string amongst an array of strings.
    // If there is no common prefix, return an empty string "".

    // Example:
    // Input: strs = ["flower","flow","flight"]
    // Output: "fl"

    @Test
    void testLongestCommonPrefix() {
        String[] strs = {"flower", "flow", "flight"};
        Solution solution = new Solution();

        String expected = "fl";
        String actual = solution.longestCommonPrefix(strs);

        assertEquals(expected, actual);
    }
}