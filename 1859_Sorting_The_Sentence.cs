public class Solution {
    public string SortSentence(string s) {
        string[] words = s.Split(' ');
        string[] sorted_words = new string[words.Length];
        foreach (string word in words) {
            int len = word.Length;
            int index = word[len - 1] - 48 - 1;  
            sorted_words[index] = word.Substring(0, len - 1);
        }
        string result = sorted_words[0];
        for (int i = 1; i < sorted_words.Length; i++) {
            result += " " + sorted_words[i];
        }
        return result;
    }
}