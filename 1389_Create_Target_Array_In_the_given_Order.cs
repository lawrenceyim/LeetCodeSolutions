public class Solution {
    public int[] CreateTargetArray(int[] nums, int[] index) {
        ArrayList numbers = new ArrayList();
        for (int i = 0; i < nums.Length; i++) {
            numbers.Insert(index[i], nums[i]);
        }
        return (int[]) numbers.ToArray(typeof(int));
    }
}