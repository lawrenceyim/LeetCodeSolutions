public class Solution {
    public int NumJewelsInStones(string jewels, string stones) {
        int count = 0;
        foreach (char stone in stones) {
            if (jewels.IndexOf(stone) >= 0) count++;
        }
        return count;
    }
}