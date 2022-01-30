class Solution {
    public void rotate(int[] nums, int k) {
        int rotate = k % nums.length;
        int temp;
        int[] numbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i + rotate >= nums.length) {
                numbers[i + rotate - nums.length] = nums[i];
            } else {
                numbers[i + rotate] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numbers[i];
        }
    }
}