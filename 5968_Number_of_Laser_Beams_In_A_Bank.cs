public class Solution {
    public int NumberOfBeams(string[] bank) {
        int beams = 0;
        int row_one = 0;
        int row_two = 0;
        for (int row = 0; row < bank.Length; row++) {
            for (int column = 0; column < bank[row].Length; column++) {
                if (bank[row][column] == '1') row_two++;
            }
            if (row_one == 0) {
                row_one = row_two;
                row_two = 0;
            }
            else if (row_one > 0 && row_two > 0) {
                beams += row_one * row_two;
                row_one = row_two;
                row_two = 0;
            }
        }
        return beams;
    }
}