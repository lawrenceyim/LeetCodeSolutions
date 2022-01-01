public class Solution {
    public int[] SmallerNumbersThanCurrent(int[] nums) {
        int[] numbers = new int[nums.Length];
        int[] arr = nums.ToArray();
        Array.Sort(arr);
        for (int number = 0; number < nums.Length; number++) {
            numbers[number] = Array.IndexOf(arr, nums[number]);
        }
        return numbers;
    }
}