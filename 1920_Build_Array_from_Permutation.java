class Solution {
    public int[] buildArray(int[] nums) {
        int[] numbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = nums[i];
            numbers[i] = nums[numbers[i]];
        }
        return numbers;
    }
}
