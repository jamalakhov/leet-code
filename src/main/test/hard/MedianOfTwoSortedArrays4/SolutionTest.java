package hard.MedianOfTwoSortedArrays4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    // Given two sorted arrays nums1 and nums2 of size m and n respectively,
    // return the median of the two sorted arrays.//
    // The overall run time complexity should be O(log (m+n)).

    // Example:
    // Input: nums1 = [1,3], nums2 = [2]
    // Output: 2.00000
    // Explanation: merged array = [1,2,3] and median is 2.

    @Test
    void testFindMedianSortedArrays() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};

        Solution solution = new Solution();

        double expected = 2.50000;
        double actual = solution.findMedianSortedArrays(nums1, nums2);

        assertEquals(expected, actual);
    }
}