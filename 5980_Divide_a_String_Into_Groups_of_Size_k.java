class Solution {
    public static String[] divideString(String s, int k, char fill) {
        int total_length = s.length();
        if (s.length() % k != 0) {
            total_length += k - (s.length() % k);
        }
        int elements = total_length / k;
        String[] divided = new String[elements];
        String word = "";
        int index = 0;
        for (int i = 0; i < total_length; i++) {
            try {
                word += s.charAt(i);
                if (word.length() >= k) {
                    divided[index] = word;
                    word = "";
                    index++;
                }
            } catch (Exception e) {
                word += fill;
                if (word.length() == k) {
                    divided[index] = word;
                }
            }
        }
        return divided;
    }
}