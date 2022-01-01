public class Solution {
    public int FinalValueAfterOperations(string[] operations) {
        int x = 0;
        foreach (string value in operations) {
            if (value[1] == '+') {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}