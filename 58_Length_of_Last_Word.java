class Solution {
    public int lengthOfLastWord(String s) {
        boolean found = false;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && !found) {
                found = true;
                count = 1;
            } else if (s.charAt(i) != ' ' && found) {
                count++;
            } else if (s.charAt(i) == ' ' && found) {
                found = false;
            }
        }
        return count;
    }
}
