public class Solution {
    public IList<bool> KidsWithCandies(int[] candies, int extraCandies) {
        bool[] greatest = new bool[candies.Length];
        int max = 0;
        for (int i = 0; i < candies.Length; i++) {
            if (candies[i] > max) max = candies[i];
        }
        for (int i = 0; i < candies.Length; i++) {
            greatest[i] = candies[i] + extraCandies >= max;
        }
        return greatest;
    }
}