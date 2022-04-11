class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int size = grid.length * grid[0].length;
        int[] num = new int[size];
        int index = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                num[index] = grid[i][j];
                index++;
            }
        }
        int shift = k % size;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            if (i - shift < 0) {
                numbers[i] = num[(i - shift) + size];
            } else {
                numbers[i] = num[i - shift];
            }
        }
        index = 0;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                list.add(numbers[index]);
                index++;
            }
            res.add(list);
        }
        return res;
    }
}