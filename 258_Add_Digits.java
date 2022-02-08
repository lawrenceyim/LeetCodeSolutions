class Solution {
    public int addDigits(int num) {
        String number = String.valueOf(num);
        while (number.length() > 1) {
            int value = 0;
            for (int i = 0; i < number.length(); i++) {
                value += Integer.valueOf(number.charAt(i)) - 48;
            }
            number = String.valueOf(value);
        }
        return Integer.valueOf(number);
    }
}