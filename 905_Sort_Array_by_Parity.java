class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] numbers = new int[nums.length];
        int odd = nums.length - 1;
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                numbers[even] = nums[i];
                even++;
            } else {
                numbers[odd] = nums[i];
                odd--;
            }
        }
        return numbers;
    }
}