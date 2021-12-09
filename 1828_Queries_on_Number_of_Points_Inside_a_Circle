class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] numbers = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            for (int j = 0; j < points.length; j++) {
                int x = (points[j][0] - queries[i][0]) * (points[j][0] - queries[i][0]);
                int y = (points[j][1] - queries[i][1]) * (points[j][1] - queries[i][1]);
                int z = queries[i][2] * queries[i][2];
                if ((x + y) <= z) {
                    sum++;
                }
            }
            numbers[i] = sum;
        }
        return numbers;    
    }
}
