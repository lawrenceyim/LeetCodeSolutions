class Solution {
    public int majorityElement(int[] nums) {
        int majority = (int) Math.ceil(nums.length / 2.0);
        int value = nums[0];
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                count = 1;
            } else count++;
            if (count >= majority) {
                    value = nums[i];
                    break;
            }
        }
        return value;
    }
}