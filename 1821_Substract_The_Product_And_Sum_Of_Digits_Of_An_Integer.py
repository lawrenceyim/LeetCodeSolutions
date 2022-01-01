public class Solution {
    public int SubtractProductAndSum(int n) {
        string a = Convert.ToString(n);   
        int[] digits = new int[a.Length];
        for (int i = 0; i < a.Length; i++) {
            digits[i] = (int)(a[i] - '0');
        }
        int sum = digits[0];
        int product = digits[0];
        for (int i = 1; i < digits.Length; i++) {
            sum += digits[i];
            product *= digits[i];
        }
        return product - sum;
    }
}