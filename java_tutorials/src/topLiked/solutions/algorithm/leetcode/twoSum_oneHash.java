package topLiked.solutions.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class twoSum_oneHash {

    public int [] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
