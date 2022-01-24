class Solution {
    public boolean detectCapitalUse(String word) {
        return (word.equals(convertToFirstUpper(word)) || 
            word.equals(convertToAllUpper(word)) ||
            word.equals(convertToAllLower(word)));
    }
    
    public String convertToFirstUpper(String word) {
        String result = "";
        result += Character.toUpperCase(word.charAt(0));
        for (int i = 1; i < word.length(); i++) {
            result += Character.toLowerCase(word.charAt(i));
        }
        return result;
    }
    
    public String convertToAllUpper(String word) {
        return word.toUpperCase();
    }
    
    public String convertToAllLower(String word) {
        return word.toLowerCase();
    }
}