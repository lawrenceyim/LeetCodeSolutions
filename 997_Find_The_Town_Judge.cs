public class Solution {
    public int FindJudge(int n, int[][] trust) {
        int[] trusts = new int[n + 1];
        int[] trusted_by = new int[n + 1];
        for (int person = 0; person < trust.Length; person++) {
            trusts[trust[person][0]]++;
            trusted_by[trust[person][1]]++;
        }
        for (int index = 1; index < trusts.Length; index++) {
            if (trusts[index] == 0 && trusted_by[index] == n - 1) {
                return index;
            }
        }
        return -1;
    }
}
