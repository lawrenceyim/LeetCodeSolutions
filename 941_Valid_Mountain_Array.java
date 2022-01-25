class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        boolean increase = false;
        boolean decrease = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i]) return false;
            else if (!increase && arr[i + 1] > arr[i]) increase = true;
            else if (!decrease && arr[i + 1] < arr[i]) decrease = true;
            if (decrease && !increase) return false;
            if (decrease && arr[i + 1] > arr[i]) return false;
        }
        return increase == true && decrease == true ? true : false;
    }
}