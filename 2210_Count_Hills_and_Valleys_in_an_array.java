class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        boolean trough = false;
        boolean peak = false;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] > nums[i] && nums[i + 1] < nums[i]) continue;
            else if (nums[i - 1] < nums[i] && nums[i + 1] > nums[i]) continue;
            else if (nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) count++;
            else if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) count++;
            else if (nums[i - 1] > nums[i] && nums[i + 1] == nums[i]) {
                trough = true;
            }
            else if (trough && nums[i + 1] > nums[i]) {
                count++;
                trough = false;
            }
            else if (trough && nums[i] < nums[i]) {
                trough = false;
            }
            else if (nums[i - 1] < nums[i] && nums[i + 1] == nums[i]) {
                peak = true;
            } else if (peak && nums[i + 1] < nums[i]) {
                count++;
                peak = false;
            }
            else if (peak && nums[i + 1] > nums[i]) {
                peak = false;
            }
        }
        return count;
    }
}