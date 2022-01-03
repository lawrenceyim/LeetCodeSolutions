public class Solution {
    public int NumPairsDivisibleBy60(int[] time) {
        int pairs = 0;
        int[] frequency = new int[60];
        for (int i = 0; i < time.Length; i++) {
           frequency[time[i] % 60]++;  
        }
        pairs += (frequency[0] * (frequency[0] - 1)) / 2;
        pairs += (frequency[30] * (frequency[30] - 1)) / 2;
        for (int i = 1; i < 30; i++) {
            pairs += frequency[i] * frequency[60 - i];
        }
        return pairs;
    }
}