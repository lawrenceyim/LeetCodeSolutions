class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] numbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
             numbers[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(numbers);
        return numbers;
    }
}