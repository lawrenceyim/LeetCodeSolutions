class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i].toLowerCase();
            if (word.length() <= 2) {
                result += word + " ";
            } else {
                result += word.substring(0, 1).toUpperCase();
                result += word.substring(1) + " ";
            }
        }
        return result.trim();
    }
}