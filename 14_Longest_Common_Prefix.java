class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int shortestLength = 200;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < shortestLength) {
                shortestLength = strs[i].length();
            }
        }
        for (int i = 0; i < shortestLength; i++) {
            boolean common = true;
            char letter = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != letter) {
                    common = false; 
                    break;
                }
            }
            if (common) {
                prefix += letter;
            } else {
                break;
            }
        }
        return prefix;
    }
}
