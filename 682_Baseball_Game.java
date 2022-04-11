class Solution {
    public int calPoints(String[] ops) {
        int[] nums = new int[ops.length];
        int index = 0;
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("+")) {
                nums[index] = nums[index - 1] + nums[index - 2];
            } else if (ops[i].equals("D")) {
                nums[index] = nums[index - 1] * 2;
            } else if (ops[i].equals("C")) {
                index--;
                nums[index] = 0;
                continue;
            } else {
                nums[index] = Integer.parseInt(ops[i]);
            }
            index++;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}