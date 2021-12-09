class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length * 2;
        int[] numbers = new int[size];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = nums[i];
            numbers[i + nums.length] = nums[i];
        }
        return numbers;
    }
}
