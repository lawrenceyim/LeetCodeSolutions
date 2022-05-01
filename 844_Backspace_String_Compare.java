class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack a = new Stack<String>();
        Stack b = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals("#")) {
                if (!a.empty()) a.pop();
            }
            else a.push(String.valueOf(s.charAt(i)));
        }
        for (int i = 0; i < t.length(); i++) {
            if (String.valueOf(t.charAt(i)).equals("#")) {
                if (!b.empty()) b.pop();
            }
            else b.push(String.valueOf(t.charAt(i)));
        }
        while (!a.empty() && !b.empty()) {
            if (!a.pop().equals(b.pop())) return false;
        }
        if (!a.empty() || !b.empty()) return false;
        return true;
    }
}