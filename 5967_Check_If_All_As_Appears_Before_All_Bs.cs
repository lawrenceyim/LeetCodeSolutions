public class Solution {
    public bool CheckString(string s) {
        if (!s.Contains('a') || !s.Contains('b')) return true;
        int last_a = 0;
        int first_b = 0;
        for (int i = s.Length - 1; i >= 0; i--) {
            if (s[i] == 'b') first_b = i;
        }
        for (int i = 0; i < s.Length; i++) {
            if (s[i] == 'a') last_a = i;
        }
        return (first_b > last_a);
    }
}