class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        int depth = 0;
        boolean closed = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                depth++;
                closed = false;
            }
            else {
                if (!closed) {
                    score += Math.pow(2, depth - 1);
                    closed = true;            
                } 
                depth--;
            }
        }
        return score;
    }
}