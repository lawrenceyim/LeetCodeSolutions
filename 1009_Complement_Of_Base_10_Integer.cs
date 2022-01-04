// First solution
public class Solution {
    public int BitwiseComplement(int n) {
        string a = Convert.ToString(n);
        string input = Convert.ToString(Convert.ToInt32(a, 10), 2);
        string flipped = "";
        for (int i = 0; i < input.Length; i++) {
            if (input[i] == '1') {
                flipped += '0';
            } else {
                flipped += '1';
            }
        }
        string result = Convert.ToString(Convert.ToInt32(flipped, 2), 10);
        return Convert.ToInt32(result);
    }
}

// Refactored
public class Solution {
    public int BitwiseComplement(int n) {
        string input = Convert.ToString(n, 2);
        string flipped = "";
        for (int i = 0; i < input.Length; i++) {
            if (input[i] == '1') {
                flipped += '0';
            } else {
                flipped += '1';
            }
        }
        return Convert.ToInt32(flipped, 2);
    }
}