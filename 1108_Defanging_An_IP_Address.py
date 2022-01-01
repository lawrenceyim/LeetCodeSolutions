public class Solution {
    public string DefangIPaddr(string address) {
        StringBuilder sb = new StringBuilder();
        foreach (char value in address) {
            if (value == '.') {
                sb.Append("[.]");
            } else {
                sb.Append(value);
            }
        }
        return sb.ToString();
    }
}