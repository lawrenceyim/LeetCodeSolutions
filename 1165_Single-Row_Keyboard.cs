public class Solution {
    public int CalculateTime(string keyboard, string word) {
        int index = 0;
        int time = 0;
        foreach (char letter in word) {
            time += Math.Abs(index - keyboard.IndexOf(letter));
            index = keyboard.IndexOf(letter);
        }
        return time;
    }
}