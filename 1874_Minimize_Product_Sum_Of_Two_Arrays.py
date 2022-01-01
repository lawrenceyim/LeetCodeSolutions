public class Solution {
    public int MinProductSum(int[] nums1, int[] nums2) {
        Array.Sort(nums1);
        Array.Sort(nums2);
        int sum = 0;
        for (int i = 0; i < nums1.Length; i++) {
            sum += nums1[i] * nums2[nums1.Length - i - 1];
        }
        return sum;
    }
}