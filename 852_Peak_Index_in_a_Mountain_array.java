class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak = 0;
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                peak = i;
                break;
            }
        }
        return peak;
    }
}