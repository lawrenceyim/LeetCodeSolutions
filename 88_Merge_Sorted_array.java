import java.util.PriorityQueue;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer> sorted = new PriorityQueue<Integer>();
        for (int i = 0; i < m; i++) {
            sorted.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            sorted.add(nums2[i]);
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = sorted.poll(); 
        }
    }
}