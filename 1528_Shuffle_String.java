class Solution {
    public String restoreString(String s, int[] indices) {
        String[] str = new String[s.length()];
        for (int i = 0; i < indices.length; i++) {
            String a = "" + s.charAt(i);
            str[indices[i]] = a;
        }
        String b = "";
        for (int i = 0; i < str.length; i++) {
            b += str[i];
        }
        return b;
    }
}
