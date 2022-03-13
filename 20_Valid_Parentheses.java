import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char value = s.charAt(i);
            if (value == '{' || value == '(' || value == '[') {
                stack.push(value);
            } else {
                if (stack.empty()) return false;
                char popped = stack.pop();
                if (value == '}' && popped != '{') return false;
                else if (value == ')' && popped != '(') return false;
                else if (value == ']' && popped != '[') return false;
            }
        }
        if (!stack.empty()) return false;
        return true;
    }
}