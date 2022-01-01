public class Solution {
    public string RestoreString(string s, int[] indices) {
        char[] unshuffled = new char[s.Length];
        for (int i = 0; i < s.Length; i++) {
            unshuffled[indices[i]] = s[i];
        }
        return new string(unshuffled);
    }
}