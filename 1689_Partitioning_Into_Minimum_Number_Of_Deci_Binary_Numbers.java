class Solution {
    public int minPartitions(String n) {
        int largestDigit = 0;
        for (int i = 0; i < n.length(); i++) {
            String a = "" + n.charAt(i);
            int x = Integer.parseInt(a);
            if (x > largestDigit) {
                largestDigit = x;
            }
        }
        return largestDigit;
    }
}
