public class Solution {
    public string Interpret(string command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.Length; i++) {
            if (command[i] == 'G') sb.Append("G");
            else if (command[i] == '(' && command[i + 1] == 'a') sb.Append("al");
            else if (command[i] == '(') sb.Append("o");
        }
        return sb.ToString();
    }
}