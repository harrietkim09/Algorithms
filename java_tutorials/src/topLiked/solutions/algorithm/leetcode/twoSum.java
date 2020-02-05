package topLiked.solutions.algorithm.leetcode;

public class twoSum {
    public int[] twoSum(int[] nums, int target) throws IllegalArgumentException {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

/*
    Complexity Analysis
    - Time complexity : O(n2)
    For each element, we try to find its complement
    by looping through the rest of array which takes O(n) time.
    Therefore, the time complexity is O(n2).

    - Space complexity : O(1).
*/
