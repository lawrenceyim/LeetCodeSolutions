class Solution {
    public int reverse(int x) {
        String str = String.valueOf(x);
        boolean negative = (x < 0);
        String num = "";
        int number;
        if (!negative) {
            for (int i = str.length() -1; i >= 0; i--) {
                num += str.charAt(i);
            }    
        } else {
            for (int i = str.length() - 1; i > 0; i--) {
                num += str.charAt(i);
            }
        }
        try {
            number = Integer.parseInt(num);
            if (negative) {
                number *= -1;
            }
        }
        catch (Exception e) {
            return 0;
        }
        return number;
    }
}
