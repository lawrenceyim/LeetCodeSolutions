class Solution {
    public int firstUniqChar(String s) {
        Set<Character> seen = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (seen.contains(s.charAt(i))) continue;
            for (int j = i + 1; j < s.length(); j++) {
                if (seen.contains(s.charAt(j))) continue;
                else if (s.charAt(i) == s.charAt(j)) {
                    seen.add(s.charAt(i));
                    break;
                }
            }
            if (!seen.contains(s.charAt(i))) return i;
        }
        return -1;
    }
}