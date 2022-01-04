public class Solution {
    public int[] ExecuteInstructions(int n, int[] startPos, string s) {
        int[] moves = new int[s.Length];
        for (int i = 0; i < s.Length; i++) {
            int[] position = new int[2];
            startPos.CopyTo(position, 0);
            int moved = 0;
            for (int j = i; j < s.Length; j++) {
                position = move(s[j], position);
                if (out_of_bounds(position, n)) {
                    break;
                }
                moved++;
            }
            moves[i] = moved;
        }
        return moves;
    }
    
    public bool out_of_bounds(int[] position, int grid_size) {
        return (position[0] > grid_size - 1 || position[0] < 0 ||
                position[1] > grid_size - 1 || position[1] < 0);
    }
    
    public int[] move(char move, int[] position) {
        if (move == 'L') position[1]--;
        else if (move == 'R') position[1]++;
        else if (move == 'U') position[0]--;
        else if (move == 'D') position[0]++;
        return position;
    }
}