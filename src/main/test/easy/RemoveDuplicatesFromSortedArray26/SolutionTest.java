package easy.RemoveDuplicatesFromSortedArray26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
//    Given an integer array nums sorted in non-decreasing order,
//    remove the duplicates in-place such that each unique element appears only once.
//    The relative order of the elements should be kept the same.
//    Then return the number of unique elements in nums.//
//    Consider the number of unique elements of nums back, to get accepted, you need to do the following things://
//    Change the array nums such that the first k elements of nums contain the unique elements
//    in the order they were present in nums initially.
//    The remaining elements of nums are not important as well as the size of nums.
//    Return k.

    @Test
    void testRemoveDuplicates() {
        Solution solution = new Solution();
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int[] expected = new int[]{0, 1, 2, 3, 4};
        int count = solution.removeDuplicates(nums);

        int[] actual = new int[count];
        System.arraycopy(nums, 0, actual, 0, count);

        assertArrayEquals(actual, expected);
    }
}
