import java.lang.Math;

class Solution {
    public int[] minOperations(String boxes) {
        int[] moves = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            int count = 0;
            for (int j = 0; j < boxes.length(); j++) {
                if (boxes.charAt(j) == '1') {
                    count += Math.abs(j - i);
                }
            }
            moves[i] = count;
        }
        return moves;
    }
}
