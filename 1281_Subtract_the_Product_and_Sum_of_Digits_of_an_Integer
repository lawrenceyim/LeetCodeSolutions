class Solution {
    public int subtractProductAndSum(int n) {
        String num = String.valueOf(n);
        int sum = 0, product = 1;
        for (int i = 0; i < num.length(); i++) {
            String a = "" + num.charAt(i);
            int number = Integer.parseInt(a);
            sum += number;
            product *= number;
        }
        return product - sum;
    }
}
