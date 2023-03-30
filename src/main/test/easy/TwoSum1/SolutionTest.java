package easy.TwoSum1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    // Given an array of integers nums and an integer target,
    // return indices of the two numbers such that they add up to target.
    // You may assume that each input would have exactly one solution,
    // and you may not use the same element twice.
    // You can return the answer in any order.

    // Example:
    // Input: nums = [2,7,11,15], target = 9
    // Output: [0,1]
    // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    @Test
    void testTwoSum() {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();

        int[] expected = new int[]{0, 1};
        int[] actual = solution.twoSum(numbers, target);

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }
}