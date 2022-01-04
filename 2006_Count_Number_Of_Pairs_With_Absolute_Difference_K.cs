// First attempt. O(n^2) time complexity
public class Solution {
    public int CountKDifference(int[] nums, int k) {
        int pairs = 0;
        for (int i = 0; i < nums.Length - 1; i++) {
            for (int j = i + 1; j < nums.Length; j++) {
                if (Math.Abs(nums[i] - nums[j]) == k) pairs++;
            }
        }
        return pairs;
    }
}


