class Solution {
    public int[] twoSum(int[] n, int t) {
        for (int i = n.length - 1; i > -1; i--) {
            for (int j = i - 1; j > -1; j--) {
                if (t == n[j] + n[i]) {
                    return new int[] {j, i};
                }
            }
        }
        return new int[2];
    }
}
