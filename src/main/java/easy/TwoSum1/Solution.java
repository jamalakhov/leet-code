package easy.TwoSum1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];

            if (complementMap.containsKey(complement)) {
                return new int[]{complementMap.get(complement), i};
            }

            complementMap.put(nums[i], i);
        }
        return new int[0];
    }
}