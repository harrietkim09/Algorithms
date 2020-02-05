package topLiked.solutions.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class twoSum_twoHash {
    public int[] twoSum(int[] nums, int target) throws IllegalArgumentException {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i)
                return new int[]{i, map.get(complement)};
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

/*
    Complexity Analysis:

        Time complexity : O(n).
        We traverse the list containing nn elements exactly twice.
        Since the hash table reduces the look up time to O(1), the time complexity is O(n).

        Space complexity : O(n).
        The extra space required depends on the number of items stored in the hash table,
        which stores exactly nn elements.
*/