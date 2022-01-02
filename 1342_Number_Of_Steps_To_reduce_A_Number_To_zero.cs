public class Solution {
    public int NumberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 != 0) {
                steps++;
                num--;
            } else {
                steps++;
                num /= 2;
            }
        }
        return steps;
    }
}