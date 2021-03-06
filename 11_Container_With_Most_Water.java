class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
             max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
            if (height[i] > height[j]) j--;
            else i++;
        }
        return max;
    }
}